package it.nico.Agenda.repository;

import it.nico.Agenda.classes.Agenda;
import org.springframework.data.repository.CrudRepository;

public interface AgRepository extends CrudRepository<Agenda, Integer> {
}
