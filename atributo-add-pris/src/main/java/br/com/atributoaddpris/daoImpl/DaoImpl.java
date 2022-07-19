package br.com.atributoaddpris.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import br.com.atributoaddpris.dao.Dao;
import br.com.atributoaddpris.util.Util;
import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class DaoImpl implements Dao {

	@PersistenceContext
	private EntityManager entityManager;
	
	private static final String SQL_PROCEDURE_DELETE = "BEGIN system.deleteTeste ; END;"; 

	private static final String SQL_PROCEDURE_INSERT = "BEGIN system.insertTeste ; END;";

	@Transactional
	@Modifying
	public void delete() {

		try {
			
			Query query = entityManager.createNativeQuery(SQL_PROCEDURE_DELETE);
			int linhas = query.executeUpdate();
			log.info(" ----------------------- Fim do servico de DELETE {} ----------------- ", Util.formataDateAtual());
			log.info(" --------------------------------------------------------------------------------------\n ");

		} catch (SecurityException | IllegalStateException | PersistenceException  e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional
	@Modifying
	public void insert() {

		try {

			Query query = entityManager.createNativeQuery(SQL_PROCEDURE_INSERT);
			int linhas = query.executeUpdate();
			log.info(" ----------------------- Fim do servico de INSERT {} ----------------- ", Util.formataDateAtual());
			log.info(" --------------------------------------------------------------------------------------\n ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
