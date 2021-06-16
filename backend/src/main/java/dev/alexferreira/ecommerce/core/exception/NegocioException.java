package dev.alexferreira.ecommerce.core.exception;


public class NegocioException extends RuntimeException {

	private int httpCode = 422;

	public NegocioException(String message) {
		super(message);
	}

	public NegocioException(String message, int httpCode) {
		super(message);
		this.httpCode = httpCode;
	}

	public NegocioException(String message, Throwable cause) {
		super(message, cause);
	}

	public int getHttpCode() {
		return httpCode;
	}
}
