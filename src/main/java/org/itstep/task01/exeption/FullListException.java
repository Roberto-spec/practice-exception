package org.itstep.task01.exeption;

public class FullListException extends ListException{
    public FullListException() {
    }

    public FullListException(String message) {
        super(message);
    }
}
