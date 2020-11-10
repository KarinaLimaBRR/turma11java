package org.generation.controllers;

import java.util.List;

import org.generation.models.CategoriaModel;
import org.generation.models.JogoModel;
import org.generation.repositories.CategoriaRepository;
import org.generation.repositories.JogoRepository;
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
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/jogos")		
public class JogoController {
	
	@Autowired
	private JogoRepository repository;
	
	
	
	@GetMapping
	public ResponseEntity<List<JogoModel>> buscarTodasjogos () {
	   return ResponseEntity.ok(repository.findAll());
	}
			
	@GetMapping("/id/ide")
	public ResponseEntity<JogoModel> buscarJogoPorId(@PathVariable long id){
		return repository.findById(id).
				map (resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
		
				
	}

     @GetMapping ("/descricao/{descricao}")
     public ResponseEntity<List<JogoModel>> buscarJogoPorNome(@PathVariable String nome){
    	 return ResponseEntity.ok(repository.findByNome(nome));
    	 
     }
     @PostMapping
     public ResponseEntity<JogoModel>postarCategoria(@RequestBody JogoModel Jogo){
    	 repository.save(Jogo);
    	 return ResponseEntity.status(HttpStatus.CREATED).body(Jogo);
     }
     
     @PutMapping("/atualizar")
     public ResponseEntity<JogoModel> atualizarJogo(@RequestBody JogoModel Jogo){
     return ResponseEntity.status(HttpStatus.OK).body(Jogo);
}
   @DeleteMapping("/deletar/{id}")
   public void deletarJogoPorId(@PathVariable Long id) {
	   repository.deleteById(id);
   }
   }
		

