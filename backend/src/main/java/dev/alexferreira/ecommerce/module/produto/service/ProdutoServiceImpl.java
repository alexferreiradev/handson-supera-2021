package dev.alexferreira.ecommerce.module.produto.service;

import dev.alexferreira.ecommerce.module.produto.Produto;
import dev.alexferreira.ecommerce.module.produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	final ProdutoRepository repository;

	public ProdutoServiceImpl(ProdutoRepository repository) {
		this.repository = repository;
	}

	@Override
	public Produto getPorId(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Produto> getTodosProdutos() {
		Iterable<Produto> iterable = repository.findAll();
		List<Produto> produtos = new ArrayList<>();
		for (Produto produto : iterable) {
			produtos.add(produto);
		}
		return produtos;
	}
}
