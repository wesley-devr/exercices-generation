package com.springtest.testapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.testapp.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

}
