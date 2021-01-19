package org.itstep.task02;

import org.itstep.task01.List;
import org.itstep.task01.exeption.EmptyListException;
import org.itstep.task01.exeption.FullListException;
import org.itstep.task02.exeption.GreatHundredException;
import org.itstep.task02.exeption.NegativeNumberException;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
//0_0



    }
    public static void getPositiveLessHundredNumber(int number) throws GreatHundredException, NegativeNumberException {
        if (number < 0){
            throw new NegativeNumberException("число отрицательное");
        }

        if (number > 100){
            throw new GreatHundredException("число больше 100");
        }


    }
}
