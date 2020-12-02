package com.example.SpringBoot_Rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_Rest.entities.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {

		Categoria cat = new Categoria(1, "Placa de Video");
		Categoria cat1 = new Categoria(2, "Placa de Mãe");

		List<Categoria> lista = new ArrayList<>();
		lista.add(cat);
		lista.add(cat1);

		return lista;
	}

}
