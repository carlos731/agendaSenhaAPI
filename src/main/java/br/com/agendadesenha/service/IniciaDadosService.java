package br.com.agendadesenha.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.agendadesenha.model.Agenda;

@Service
public class IniciaDadosService {
	

	public void instanciaDB() {
		
		Agenda agenda1 = new Agenda("facebook", "carlos@gmail.com", "face@1234", new Date());
		Agenda agenda2 = new Agenda("instagram", "carlos@gmail.com", "insta@1234", new Date());
		
	}

}
