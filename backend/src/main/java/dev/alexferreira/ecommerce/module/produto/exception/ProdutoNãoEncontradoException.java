package dev.alexferreira.ecommerce.module.produto.exception;

public class ProdutoNãoEncontradoException extends Exception {

	public ProdutoNãoEncontradoException() {
	}

	public ProdutoNãoEncontradoException(String message) {
		super(message);
	}

	public ProdutoNãoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}
}
