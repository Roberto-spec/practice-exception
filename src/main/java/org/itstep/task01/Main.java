package org.itstep.task01;

import org.itstep.task01.exeption.EmptyListException;
import org.itstep.task01.exeption.FullListException;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        int size=2;
        List list=new List(size);
        System.out.println("Массив размером "+size);
        int i;
        for( i=0;i<=size;i++) {
            try {

                list.add(i);
                System.out.println("Элемент "+i+" добавлен");
            } catch (FullListException h) {
                System.out.println("Элемент "+i+" не добавлен");
            }
            ;
        }
        for(i=size;i>=0;i--) {
            try {

                list.removeLast();
                System.out.println("Элемент "+(i-1)+" удален");
            } catch (EmptyListException h) {
                System.out.println("Массив пустой, элемент не удален");
            }
            ;
        }
    }
}
