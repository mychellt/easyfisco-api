package br.com.easyfisco.exception;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 11/11/2020
 */
public class BusinessException extends Exception {

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}
}
