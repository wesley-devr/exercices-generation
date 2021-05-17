package com.farmacia.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.app.model.Categoria;
import com.farmacia.app.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;

	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria() {
		return ResponseEntity.status(200).body(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Categoria>> findByIDCategoria(@PathVariable long id) {
		return ResponseEntity.status(200).body(repository.findById(id));
	}

	@GetMapping("/descricao")
	public ResponseEntity<List<Categoria>> findByDescricaoAndCategoria(@RequestBody String descricao) {
		return ResponseEntity.status(200).body(repository.findByDescricaoAndCategoria(descricao));
	}

	@PostMapping
	public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria) {
		return ResponseEntity.status(201).body(repository.save(categoria));
	}

	@PutMapping
	public ResponseEntity<Categoria> putCategoria(@RequestParam Categoria categoria) {
		return ResponseEntity.status(200).body(repository.save(categoria));
	}

	@DeleteMapping("{id}")
	public void deleteCategoria(@PathVariable long id) {
		repository.deleteById(id);
	}
}
