package com.example.SpringBoot_Rest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot_Rest.entities.Categoria;
import com.example.SpringBoot_Rest.repositories.RepositorioCategoria;

@Service
public class ServicosCategorias {

	@Autowired
	private RepositorioCategoria repo;

	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
