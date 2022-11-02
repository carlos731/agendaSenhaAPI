package br.com.agendadesenha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agendadesenha.model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
