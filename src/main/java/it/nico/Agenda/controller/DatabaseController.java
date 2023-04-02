package it.nico.Agenda.controller;

import it.nico.Agenda.classes.Agenda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseController {
    /*
    public EntityManagerFactory emf;

    public void AppController() { // Persistence --> classe Bootstrap
        emf = Persistence.createEntityManagerFactory("persistenceUnit") ;
    }
    // inserisci un veicolo
    public void inserisci (Agenda agenda){
        // creare un entitymanager
        EntityManager em = emf.createEntityManager(); // non e trade safe
        // attivare la transazione
        em.getTransaction().begin();
        // dichiaro l'intent di scrivere l'oggetto sul db
        em.persist(agenda);
        // effettuo la scrittura sul db
        em.getTransaction().commit(); // ora ha scritto sul db l'oggetto
        // chiudere la transazione
        em.close();
    }
    public void elimina (Agenda agenda){
        // creare un entitymanager
        EntityManager em = emf.createEntityManager(); // non e trade safe
    }

    // seleziono le proprieta da estrarre
    public void modifica (){
        EntityManager em = emf.createEntityManager();
    }
     */
}
