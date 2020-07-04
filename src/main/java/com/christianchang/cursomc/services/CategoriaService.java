package com.christianchang.cursomc.services;

	

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christianchang.cursomc.domain.Categoria;
import com.christianchang.cursomc.repositories.CategoriaRepository;


@Service
public class CategoriaService {
 
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria>	 obj = repo.findById(id);
		return obj.orElse(null);
	}	
}
	