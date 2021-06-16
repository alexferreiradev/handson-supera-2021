import React from "react";

import { Container } from "./styles";

function ListaComEstado({ dados, carregando, item }) {
  if (carregando) {
    return <Container>Carregando</Container>;
  }

  // console.log("Dados: ", dados);
  if (dados.length > 0) {
    return dados.map((dado, index) => item(dado, index));
  }

  return <Container>Nenhum dado cadastrado...</Container>;
}

export default ListaComEstado;
