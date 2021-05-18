package br.com.easyfisco.exception;

public class UnauthorizedException extends CommunicationException {

    public UnauthorizedException(String message){
        super(message);
    }
}
