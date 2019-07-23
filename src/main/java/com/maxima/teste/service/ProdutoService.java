package com.maxima.teste.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxima.teste.model.Produto;
import com.maxima.teste.repository.ProdutoRepository;

@Service	
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		try {
			return produtoRepository.findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Produto>(0);
	}
	
	public void save(Produto produto) {
		try {
			produtoRepository.save(produto);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void delete(Integer id) {
		try {
			produtoRepository.deleteById(id);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
