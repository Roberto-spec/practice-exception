package org.itstep.test01;

import org.itstep.task01.List;
import org.itstep.task01.exeption.EmptyListException;
import org.itstep.task01.exeption.FullListException;
import org.junit.Assert;
import org.junit.Test;

public class ListTest {
    private final static int SIZE=2;
    @Test
    public void removeLastTest(){

        List list=new List(SIZE);
        int i;
        for( i=0;i<SIZE;i++) {
            try {

                list.add(i);

            } catch (FullListException h) {
                System.out.println("FullListException");

            }
            ;
        }
        for(i=SIZE;i>=0;i--) {
            try {

                list.removeLast();

            } catch (EmptyListException h) {
                if(i==0){
                    Assert.assertTrue(true);
                }
                else{
                    Assert.assertTrue(false);
                }

            }
            ;
        }

    }
    @Test
    public void addTest(){
        List list=new List(SIZE);
        int i;
        for( i=0;i<=SIZE;i++) {
            try {

                list.add(i);

            } catch (FullListException h) {
                if (i==SIZE){
                    Assert.assertTrue(true);
                }
                else {
                    Assert.assertTrue(false);
                }

            }
            ;
        }

    }
}
