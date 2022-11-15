package br.com.manage_cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import br.com.manage_cars.model.Pessoa;
import br.com.manage_cars.repository.PessoaRepository;

@RestController
public class ManageController {
	
	@Autowired
 private 	PessoaRepository pessoaRepository;



	
	
	
	
	//essemetodo tras todos os cadastros contidos em nossa tabela
	
	
	@GetMapping ( value = "listar")
	@ResponseBody
public ResponseEntity<List<Pessoa>> listPessoa(){
	
	List<Pessoa> pessoas = pessoaRepository.findAll();
	
	
	return  new ResponseEntity<List<Pessoa>>(pessoas,HttpStatus.OK);
	
	
	
}

//cadsatra dados no banco de dados
	
	
	@PostMapping( value ="salvar") 
	@ResponseBody
	 public ResponseEntity<Pessoa> salvar(@RequestBody  Pessoa id_pessoa){
		 
		 Pessoa  pessoa = (Pessoa) pessoaRepository.save(id_pessoa);
		 	
		 
		 return  new ResponseEntity<Pessoa>(pessoa, HttpStatus.CREATED);
	 }
	
	
	// Esse metodo deleta da base de dados usandoum ID especifico
	@DeleteMapping( value ="deletar") 
	@ResponseBody
	 public ResponseEntity<String> deletar(@RequestParam Long id_pessoa){/*@RequesteParam. Faz uso dos dados na  da base de dados , ele tem acesso a cada informação e a acada dado contido no BD*/
		pessoaRepository.deleteById(id_pessoa);
		 
		 
		 return  new ResponseEntity<String>("A pagado com suscesso do BD!!!", HttpStatus.OK);
	 }

	// busca por um dado especifico na base de dados
	@GetMapping( value ="atualizar") 
	@ResponseBody
	 public ResponseEntity<?> atualizar(@RequestBody  Pessoa pessoa){/*@RequesteParam. Faz uso dos dados na  da base de dados , ele tem acesso a cada informação e a acada dado contido no BD*/
		 if (pessoa.getNome() == null )
		 {
				return  new ResponseEntity<String>("O Id  da pessoa precisa ser informado!!!",HttpStatus.OK);
			}
			 
			 Pessoa pes = pessoaRepository.saveAndFlush(pessoa);
		 
		  return  new ResponseEntity<Pessoa>(pes,HttpStatus.OK);
	 }
	
	

}
