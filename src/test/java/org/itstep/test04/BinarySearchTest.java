package org.itstep.test04;

import org.itstep.task04.exception.ArrayNoSortException;
import org.junit.Assert;
import org.junit.Test;



import static org.itstep.task04.Main.binarySearch;

public class BinarySearchTest {
    private final static int SIZE=5;

    @Test
    public void BinarySeachSortedTest(){
        int[] ms=new int[SIZE];
        for(int i=0;i< SIZE;i++){
            ms[i]=i;
        }
        try {
            int index = binarySearch(ms, 3);
            Assert.assertTrue(true);
        }catch (ArrayNoSortException k){
            Assert.fail();
        }
    }
    @Test
    public void BinarySeachNoSortedTest(){
        int[] ms;
        ms= new int[]{0, 2, 1, 3, 4};
        try {
            int index = binarySearch(ms, 3);
            Assert.fail();
        }catch (ArrayNoSortException k){
            Assert.assertTrue(true);
        }
    }
}
