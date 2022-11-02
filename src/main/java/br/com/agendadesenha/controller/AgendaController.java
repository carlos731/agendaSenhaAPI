package br.com.agendadesenha.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendadesenha.model.Agenda;
import br.com.agendadesenha.service.AgendaService;

@RestController
@RequestMapping("/api/agenda")
public class AgendaController {

	@Autowired
	private AgendaService agendaService;
	
	@GetMapping
	public List<Agenda> obterTodos(){
		return agendaService.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<Agenda> obterPorId(@PathVariable @Valid Long id){
		return agendaService.obterPorId(id);
	}
	
	@PostMapping
	public Agenda adicionar(@RequestBody @Valid Agenda agenda) {
		return agendaService.adicionar(agenda);
	}
	
}
