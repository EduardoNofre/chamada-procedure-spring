package br.com.atributoaddpris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import br.com.atributoaddpris.service.Service;


@SpringBootApplication
public class AtributoAddPrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtributoAddPrisApplication.class, args);
	}
	
	@Component
	public class CommandLineAppStartupRunner implements CommandLineRunner {
	    @Autowired
		private Service service;

	    @Override
	    public void run(String...args) throws Exception {
	    	service.inicio();

	    }
	}

}
