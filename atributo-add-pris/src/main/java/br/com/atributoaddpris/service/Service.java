package br.com.atributoaddpris.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.atributoaddpris.daoImpl.DaoImpl;
import br.com.atributoaddpris.util.Util;
import lombok.extern.slf4j.Slf4j;

@org.springframework.stereotype.Service
@Slf4j
public class Service {
	
	@Autowired
	private DaoImpl daoImpl;
	
	public void inicio() {

		log.info(" -------------------------------------------------------------------------------------- ");
		log.info(" -------------------------------- INICIANDO A EXECUÇÃO -------------------------------- ");
		log.info(" --------------------------------------------------------------------------------------\n ");
		deleteDados();
		
		insertDados();
		
	}

	private void deleteDados() {	
		
		log.info(" -------------------------------------------------------------------------------------- ");
		log.info(" ----------------------- Preparando para chamar o servico de DELETE ------------------- ",Util.formataDateAtual());
		log.info(" -------------------------------------------------------------------------------------- ");
		log.info(" ----------------------- Inicio do servico de DELETE {} -------------- ",Util.formataDateAtual());
		log.info(" -------------------------------------------------------------------------------------- ");
		daoImpl.delete();
	}

	private void insertDados() {
		log.info(" -------------------------------------------------------------------------------------- ");
		log.info(" ----------------------- Preparando para chamar o servico de INSERT ------------------- ",Util.formataDateAtual());
		log.info(" -------------------------------------------------------------------------------------- ");
		log.info(" ----------------------- Inicio do servico de INSERT {} -------------- ",Util.formataDateAtual());
		log.info(" -------------------------------------------------------------------------------------- ");
		daoImpl.insert();
	}
}
