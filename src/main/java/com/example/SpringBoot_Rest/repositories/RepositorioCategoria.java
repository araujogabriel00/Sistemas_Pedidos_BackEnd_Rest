package com.example.SpringBoot_Rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot_Rest.entities.Categoria;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria,Integer> {



}
