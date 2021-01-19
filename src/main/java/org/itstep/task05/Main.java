package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        try {
            runner.halt();
        } catch (RuntimeException | IOException e){
            System.err.println("halt;");
        }
    }
}
