package dev.alexferreira.ecommerce.module.produto.service;

import dev.alexferreira.ecommerce.module.produto.model.Produto;
import dev.alexferreira.ecommerce.module.produto.command.FiltroCommand;

import java.util.List;

public interface ProdutoService {

	Produto getPorId(Long id);

	List<Produto> getTodosProdutos(FiltroCommand filtroCommand);
}
