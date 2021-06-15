package dev.alexferreira.ecommerce.module.produto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoRest {

	@GetMapping(value = "/1", produces = "application/json")
	public String getProduto() {
		return "{\"teste\": \"hello\"}";
	}
}
