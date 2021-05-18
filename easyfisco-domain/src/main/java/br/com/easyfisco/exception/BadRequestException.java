package br.com.easyfisco.exception;

public class BadRequestException extends CommunicationException {

    public BadRequestException(String message) {
        super(message);
    }
}
