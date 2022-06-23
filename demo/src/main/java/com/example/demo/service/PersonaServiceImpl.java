package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPersonaRepo;
// import com.example.demo.repository.PersonaRepoImpl;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
	//	repo = new PersonaRepoImpl();
		repo.registrar(nombre);
		
	}

}
