package org.itstep.task01.exeption;

public class EmptyListException extends ListException{
    public EmptyListException() {
    }

    public EmptyListException(String message) {
        super(message);
    }
}
