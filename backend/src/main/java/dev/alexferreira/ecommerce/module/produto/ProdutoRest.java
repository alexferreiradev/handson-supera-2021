package dev.alexferreira.ecommerce.module.produto;

import dev.alexferreira.ecommerce.module.produto.command.FiltroCommand;
import dev.alexferreira.ecommerce.module.produto.exception.ProdutoNãoEncontradoException;
import dev.alexferreira.ecommerce.module.produto.model.Produto;
import dev.alexferreira.ecommerce.module.produto.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoRest implements ProdutoApi {

	final ProdutoService service;

	public ProdutoRest(ProdutoService service) {
		this.service = service;
	}

	@GetMapping
	@Override
	public List<Produto> getTodosProdutos(@RequestParam(value = "ordenarPor", required = false) String chaveOrdenacao) {
		FiltroCommand command = new FiltroCommand();
		command.chaveOrdenacaoTxt = chaveOrdenacao;
		return service.getTodosProdutos(command);
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public String getProduto(@PathVariable("id") Long id) throws ProdutoNãoEncontradoException {
		Produto porId = service.getPorId(id);
		if (porId == null) {
			throw new ProdutoNãoEncontradoException();
		}
		return porId.toString();
	}
}
