package com.maxima.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxima.teste.model.Produto;
import com.maxima.teste.service.ProdutoService;

@RestController
@RequestMapping(path = "produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	
	@GetMapping(path= "/findAll",  produces = "application/json")
	public List<Produto> findAll(){
		return produtoService.findAll();
	}
	
	@PostMapping(path= "/save")
	public void save(@RequestBody Produto produto){
		produtoService.save(produto);
	}
	
	

	@DeleteMapping(path= "/delete/{id}")
	public void delete(@PathVariable Integer id){
		produtoService.delete(id);
	}
	
}
