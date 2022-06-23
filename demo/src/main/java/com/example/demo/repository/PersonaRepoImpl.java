package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	private static Logger log = LoggerFactory.getLogger(PersonaRepoImpl.class);

	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		log.info("Registrando en Repo a: {}", nombre);
	}

}
