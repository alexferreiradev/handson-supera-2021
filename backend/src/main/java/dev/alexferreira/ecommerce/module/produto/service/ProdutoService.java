package dev.alexferreira.ecommerce.module.produto.service;

import dev.alexferreira.ecommerce.module.produto.Produto;

import java.util.List;

public interface ProdutoService {

	Produto getPorId(Long id);

	List<Produto> getTodosProdutos();
}
