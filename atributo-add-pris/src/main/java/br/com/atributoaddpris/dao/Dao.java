package br.com.atributoaddpris.dao;

import org.springframework.data.jpa.repository.query.Procedure;

public interface Dao {

	@Procedure("deleteTeste")
	void delete();
	
	void insert();
}
