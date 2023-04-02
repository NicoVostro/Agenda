package it.nico.Agenda.classes;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "agenda")
public class Agenda {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // incrementa in automatico
    private int id;
    @Column(name="titolo")
    private String titolo;
    @Column(name="descrizione")
    private String descrizione;
    @Column(name="data")
    private LocalDate data;
    @Column(name="orario")
    private LocalTime orario;

    // esempio data: "31-03-2023" //

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getOrario() {
        return orario;
    }
    public void setOrario(LocalTime orario) {
        this.orario = orario;
    }
}
