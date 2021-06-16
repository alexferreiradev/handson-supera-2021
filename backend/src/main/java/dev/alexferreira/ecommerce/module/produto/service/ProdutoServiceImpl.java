package dev.alexferreira.ecommerce.module.produto.service;

import dev.alexferreira.ecommerce.core.exception.NegocioException;
import dev.alexferreira.ecommerce.module.produto.model.ChaveOrdenacaoProduto;
import dev.alexferreira.ecommerce.module.produto.model.Produto;
import dev.alexferreira.ecommerce.module.produto.command.FiltroCommand;
import dev.alexferreira.ecommerce.module.produto.repository.ProdutoRepository;
import org.springframework.data.domain.Sort;
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
	public List<Produto> getTodosProdutos(FiltroCommand filtroCommand) {
		valideCommandOrThrow(filtroCommand);

		Sort sort = Sort.by(Sort.Order.asc(filtroCommand.chaveOrdenacao.getChave()));
		Iterable<Produto> iterable = repository.todosProdutoOrdenadorPor(sort);
		return crieListaDeProduto(iterable);
	}

	private List<Produto> crieListaDeProduto(Iterable<Produto> iterable) {
		List<Produto> produtos = new ArrayList<>();
		for (Produto produto : iterable) {
			produtos.add(produto);
		}
		return produtos;
	}

	private void valideCommandOrThrow(FiltroCommand filtroCommand) {
		if (filtroCommand == null) throw new NegocioException("Command invalido");
		if (filtroCommand.chaveOrdenacaoTxt != null) {
			String chaveOrdenacaoTxt = filtroCommand.chaveOrdenacaoTxt;
			filtroCommand.chaveOrdenacao = ChaveOrdenacaoProduto.crieDeChave(chaveOrdenacaoTxt);
		}
	}
}
