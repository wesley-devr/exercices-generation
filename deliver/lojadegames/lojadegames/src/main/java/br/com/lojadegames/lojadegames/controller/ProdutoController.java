package br.com.lojadegames.lojadegames.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lojadegames.lojadegames.model.Produto;
import br.com.lojadegames.lojadegames.repository.ProdutoRepository;
import br.com.lojadegames.lojadegames.model.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping("/todos")
	public ResponseEntity<List<Produto>> findAllProduto() {
		return ResponseEntity.status(200).body(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Produto>> findByIdProduto(@PathVariable long id) {
		return ResponseEntity.status(200).body(repository.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) {
		return ResponseEntity.status(201).body(repository.save(produto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> putProduto(@PathVariable Produto produto) {
		return ResponseEntity.status(201).body(repository.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduto(@PathVariable long id) {
		repository.deleteById(id);
		return ResponseEntity.status(200).body("Produto deletado com sucesso!");
	}
	
}
