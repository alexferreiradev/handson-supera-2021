import React from "react";

import { Container } from "./styles";

function ProdutoItem({ produto }) {
  return (
    <Container>
      <span>Produto id: </span>
      <span>{produto.id}</span>
      <span>{produto.nome}</span>
    </Container>
  );
}

export default ProdutoItem;
