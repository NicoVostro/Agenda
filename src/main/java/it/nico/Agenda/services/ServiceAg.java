package it.nico.Agenda.services;

import it.nico.Agenda.classes.Agenda;
import it.nico.Agenda.repository.AgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceAg {
    @Autowired
    AgRepository agR;

    public void saveAppuntamenti(Agenda ag) {
        agR.save(ag);
    }

    public List<Agenda> reportAppuntamenti() {
        List<Agenda> ag = new ArrayList<>();
        agR.findAll().forEach(elemento -> ag.add(elemento));
        return ag;
    }

    public void deleteAppuntamento(int idCanc) {
            agR.deleteById(idCanc);
        }
    public Agenda prendiAppuntamentoDaId(int idFind) {
        return agR.findById(idFind).get();
    }
}
