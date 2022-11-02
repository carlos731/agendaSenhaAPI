package br.com.agendadesenha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agendadesenha.model.Agenda;
import br.com.agendadesenha.repository.AgendaRepository;

@Service
public class AgendaService {

	@Autowired
	private AgendaRepository agendaRepository;
	
	public List<Agenda> obterTodos(){
		return agendaRepository.findAll();
	}
	
	public Optional<Agenda> obterPorId(Long id){
		return agendaRepository.findById(id);
	}
	
	public Agenda adicionar(Agenda agenda) {
		return agendaRepository.save(agenda);
	}
	
	public Agenda atualizar(Long id, Agenda agenda) {
		agenda.setId(id);
		return agendaRepository.save(agenda);
	}
}
