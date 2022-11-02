package br.com.agendadesenha.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.agendadesenha.model.Agenda;
import br.com.agendadesenha.repository.AgendaRepository;

@Component
public class IniciaDadosService implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private AgendaService service;
	@Autowired
	private AgendaRepository repository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Agenda agenda1 = new Agenda("facebook", "fulano@gmail.com", "face@1234", new Date());
		Agenda agenda2 = new Agenda("instagram", "fulano@gmail.com", "insta@1234", new Date());
		Agenda agenda3 = new Agenda("senac", "09450359842", "senac@1234", new Date());
		
		repository.saveAll(Arrays.asList(agenda1, agenda2, agenda3));
		
		
	}
	
}
