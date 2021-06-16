package dev.alexferreira.ecommerce.module.produto.repository;

import dev.alexferreira.ecommerce.module.produto.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
