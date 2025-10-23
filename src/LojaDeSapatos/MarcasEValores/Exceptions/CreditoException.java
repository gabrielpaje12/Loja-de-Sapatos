package LojaDeSapatos.MarcasEValores.Exceptions;

import java.io.IOException;

public class CreditoException extends IOException {

    public CreditoException() {
        super();
    }

    public CreditoException(String message) {
        super(message);
    }

    public CreditoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreditoException(Throwable cause) {
        super(cause);
    }
}
