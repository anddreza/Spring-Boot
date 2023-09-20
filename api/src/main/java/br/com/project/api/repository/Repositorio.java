package br.com.project.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.api.model.Pessoa;

@Repository
public interface Repositorio extends CrudRepository <Pessoa, Integer> {
	List<Pessoa> findAll();
	// Posso usar qualquer característica que tenha no meu Pessoa.java
	 
	Pessoa findByCodigo(int codigo);


	List<Pessoa> findByOrderByNomeDesc();
	
	List<Pessoa> findByNomeOrderByIdadeDesc(String nome);
}


