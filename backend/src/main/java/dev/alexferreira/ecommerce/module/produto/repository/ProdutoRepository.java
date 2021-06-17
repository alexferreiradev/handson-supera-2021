package dev.alexferreira.ecommerce.module.produto.repository;

import dev.alexferreira.ecommerce.module.produto.model.Produto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

	@Query(value = "select p from Produto p")
	Iterable<Produto> todosProdutoOrdenadorPor(Sort sort);
}
