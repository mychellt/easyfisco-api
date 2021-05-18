package br.com.easyfisco.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommunicationException extends BusinessException {
    private final int rawStatusCode;
    private final String statusText;

    CommunicationException(String message) {
        super(message);
        this.rawStatusCode = -1;
        this.statusText = null;
    }

    public CommunicationException(String message, int statusCode, String statusText) {
        super(message);
        this.rawStatusCode = statusCode;
        this.statusText = statusText;
    }

    public boolean is404() {
        return rawStatusCode == 404;
    }
}
