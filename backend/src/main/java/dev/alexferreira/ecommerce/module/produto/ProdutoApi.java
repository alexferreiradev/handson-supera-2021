package dev.alexferreira.ecommerce.module.produto;

import dev.alexferreira.ecommerce.module.produto.exception.ProdutoNãoEncontradoException;
import dev.alexferreira.ecommerce.module.produto.model.Produto;

import java.util.List;

public interface ProdutoApi {

	List<Produto> getTodosProdutos(String ordenarPor);

	String getProduto(Long id) throws ProdutoNãoEncontradoException;

}
