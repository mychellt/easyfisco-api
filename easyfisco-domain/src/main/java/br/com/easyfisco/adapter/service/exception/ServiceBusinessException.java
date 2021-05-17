package br.com.easyfisco.adapter.service.exception;

public class ServiceBusinessException extends Exception {
    public ServiceBusinessException() {
        super();
    }

    public ServiceBusinessException(String exception) {
        super(exception);
    }
}
