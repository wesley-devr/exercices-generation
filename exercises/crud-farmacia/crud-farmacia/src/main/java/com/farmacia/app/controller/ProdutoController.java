package com.farmacia.app.controller;

import java.util.List;
import java.util.Optional;

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

import com.farmacia.app.model.Produto;
import com.farmacia.app.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	private ProdutoRepository repository;
	
	@GetMapping("/get")
	public ResponseEntity<List<Produto>> findAllProduto() {
		return ResponseEntity.status(200).body(repository.findAll());
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<Optional<Produto>> findByIDProduto (@PathVariable long id) {
		return ResponseEntity.status(200).body(repository.findById(id));
	}
	
	@GetMapping("/descricao/produtos")
	public ResponseEntity<List<Produto>> findByDescricaoAndCategoria(@RequestBody String descricao) {
		return ResponseEntity.status(200).body(repository.findByDescricaoAndTitulo(descricao));
	}
	
	@PostMapping("/criar")
	public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(201).body(repository.save(produto));
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Produto> putCategoria(@RequestParam Produto produto) {
		return ResponseEntity.status(200).body(repository.save(produto));
	}
	
	@DeleteMapping("{id}")
	public void deleteProduto (@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
