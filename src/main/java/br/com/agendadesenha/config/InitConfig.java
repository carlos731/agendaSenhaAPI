package br.com.agendadesenha.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.agendadesenha.service.IniciaDadosService;

@Configuration
@Profile("test")
public class InitConfig {
	
	@Autowired 
	private IniciaDadosService service;
	
	@Bean
	public void instanciaDB() {
		this.service.instanciaDB();
	}

}
