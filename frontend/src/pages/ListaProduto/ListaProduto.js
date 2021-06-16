import React from "react";

import ListaComEstado from "../../Components/ListaComEstado";
import ProdutoItem from "../../Components/ProdutoItem";
import api from "../../services/api";

import { Container } from "./styles";

function ListaProduto() {
  const [listaProduto, setListaProduto] = React.useState([]);
  const [carregando, setCarregando] = React.useState(false);

  React.useEffect(() => {
    async function carregueProdutoDaApi() {
      try {
        setCarregando(true);

        const res = await api.get('/produtos');
        // setListaProduto([
        //   { id: 1, name: 'teste' }, 
        //   { id: 2, name: 'teste2' }, 
        //   { id: 3, name: 'teste3' }
        // ]);
        setListaProduto(res.data);
      } catch (e) {
        console.error(e);
      } finally {
        setCarregando(false);
      }
    }

    carregueProdutoDaApi();
  }, []);

  return (
    <Container>
      <h2>Lista de produtos</h2>
      <ListaComEstado
        dados={listaProduto}
        carregando={carregando}
        item={(prod, index) => (
          <ProdutoItem key={prod.id || index} produto={prod} />
        )}
      />
    </Container>
  );
}

export default ListaProduto;
