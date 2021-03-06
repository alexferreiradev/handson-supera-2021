package dev.alexferreira.ecommerce.module.produto;

import dev.alexferreira.ecommerce.module.produto.exception.ProdutoNÃ£oEncontradoException;
import dev.alexferreira.ecommerce.module.produto.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public List<Produto> getTodosProdutos() {
		return service.getTodosProdutos();
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public String getProduto(@PathVariable("id") Long id) throws ProdutoNÃ£oEncontradoException {
		Produto porId = service.getPorId(id);
		if (porId == null) {
			throw new ProdutoNÃ£oEncontradoException();
		}
		return porId.toString();
	}
}
