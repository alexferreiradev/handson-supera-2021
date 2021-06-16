package dev.alexferreira.ecommerce.module.produto.model;

public enum ChaveOrdenacaoProduto {

	PRECO("price"), NOTA("score"), NOME("name"), DEFAULT("id");

	private final String chave;

	ChaveOrdenacaoProduto(String chave) {
		this.chave = chave;
	}

	public String getChave() {
		return chave;
	}

	public static ChaveOrdenacaoProduto crieDeChave(String chave) {
		if (chave == null) throw new IllegalArgumentException("Chave inválida para criacao de enum");

		for (ChaveOrdenacaoProduto value : values()) {
			if (value.chave.equalsIgnoreCase(chave)) {
				return value;
			}
		}

		throw new IllegalArgumentException("Chave: " + chave + " inválida");
	}
}
