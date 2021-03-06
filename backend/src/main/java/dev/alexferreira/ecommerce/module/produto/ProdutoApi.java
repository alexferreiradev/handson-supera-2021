package dev.alexferreira.ecommerce.module.produto;

import dev.alexferreira.ecommerce.module.produto.exception.ProdutoNÃ£oEncontradoException;

import java.util.List;

public interface ProdutoApi {

	List<Produto> getTodosProdutos();

	String getProduto(Long id) throws ProdutoNÃ£oEncontradoException;

}
