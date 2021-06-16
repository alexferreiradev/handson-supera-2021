import React from "react";

import ListaComEstado from "../../Components/ListaComEstado";
import ProdutoItem from "../../Components/ProdutoItem";

import { Container } from "./styles";

function ListaProduto() {
  const [listaProduto, setListaProduto] = React.useState([]);

  React.useEffect(() => {
    function carregueProdutoDaApi() {
      setListaProduto([
        { id: 1, name: 'teste' }, 
        { id: 2, name: 'teste2' }, 
        { id: 3, name: 'teste3' }
      ]);
    }

    carregueProdutoDaApi();
  }, []);

  return (
    <Container>
      <h2>Lista de produtos</h2>
      <ListaComEstado
        dados={listaProduto}
        carregando={false}
        item={(prod, index) => (
          <ProdutoItem key={prod.id || index} produto={prod} />
        )}
      />
    </Container>
  );
}

export default ListaProduto;
