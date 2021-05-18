package br.com.easyfisco.exception;

public class ObjectNotFoundException extends  CommunicationException{
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
