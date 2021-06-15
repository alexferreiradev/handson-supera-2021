package dev.alexferreira.ecommerce.module.produto;

import dev.alexferreira.ecommerce.module.produto.exception.ProdutoNãoEncontradoException;

import java.util.List;

public interface ProdutoApi {

	List<Produto> getTodosProdutos();

	String getProduto(Long id) throws ProdutoNãoEncontradoException;

}
