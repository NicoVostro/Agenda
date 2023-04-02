package it.nico.Agenda.controller;

import it.nico.Agenda.classes.Agenda;
import it.nico.Agenda.services.ServiceAg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class AppController {

    @Autowired
    ServiceAg srvAg;

    @PostMapping("/save")
    private ModelAndView salvaEvento(@RequestParam("titolo") String titolo,
                                     @RequestParam("descrizione") String descrizione,
                                     @RequestParam("data") LocalDate data, @RequestParam("orario") LocalTime orario, Model model) {
        Agenda ag = new Agenda();
        ModelAndView modelAndView = new ModelAndView("save");
        ag.setTitolo(titolo);
        ag.setDescrizione(descrizione);
        ag.setData(data);
        ag.setOrario(orario);
        srvAg.saveAppuntamenti(ag);
        return modelAndView.addObject(ag);
        // RICORDA: dal Postman, localhost:8080/save?titolo=esempio&descrizione=esempio&data=01/01/2024 //
    }

    @RequestMapping("/view")
    private List<Agenda> guardaEventi() {
        return srvAg.reportAppuntamenti();
    }

    @PostMapping("/delete")
    private ModelAndView cancellaEvento(@RequestParam("id") int id, Model model) {
        srvAg.deleteAppuntamento(id);
        return new ModelAndView("delete");
    }

    @PostMapping("/update")
    private ModelAndView aggiornaEvento(@RequestParam("id") int id,
                                        @RequestParam("titolo") String titolo,
                                        @RequestParam("descrizione") String descrizione,
                                        @RequestParam("data") LocalDate data,
                                        @RequestParam("orario") LocalTime orario, Model model) {
        ModelAndView modelAndView = new ModelAndView("update");
        Agenda ag = srvAg.prendiAppuntamentoDaId(id);
        ag.setTitolo(titolo);
        ag.setDescrizione(descrizione);
        ag.setData(data);
        ag.setOrario(orario);
        srvAg.saveAppuntamenti(ag);
        return modelAndView.addObject(ag);
    }
}
