package it.nico.Agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VistaBenvenuto {
    @RequestMapping("/")
    public String vistaBenvenuto (Model model) {
        return "Benvenuto";
    }
    @RequestMapping("/nuovoAppuntamento")
    public String salva (Model model) {
        return "nuovoAppuntamento";
    }
    @RequestMapping("/save")
    public String salvato (Model model) {
        return "save";
    }
    @RequestMapping("/cancellaAppuntamento")
    public String cancella (Model model) {
        return "cancellaAppuntamento";
    }
    @RequestMapping("/delete")
    public String cancellato (Model model) {
        return "delete";
    }
    @RequestMapping("/modificaAppuntamento")
    public String modifica (Model model) {
        return "modificaAppuntamento";
    }
    @RequestMapping("/update")
    public String aggiornato (Model model) {
        return "update";
    }
}
