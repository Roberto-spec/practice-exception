package org.itstep.task02.exeption;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
