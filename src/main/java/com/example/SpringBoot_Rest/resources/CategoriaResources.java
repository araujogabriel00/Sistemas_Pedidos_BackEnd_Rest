package com.example.SpringBoot_Rest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_Rest.entities.Categoria;
import com.example.SpringBoot_Rest.services.ServicosCategorias;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@Autowired
	private ServicosCategorias servico;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = servico.find(id);
		return ResponseEntity.ok().body(obj);
		

	
	}

}
