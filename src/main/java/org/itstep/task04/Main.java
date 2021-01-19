package org.itstep.task04;

import org.itstep.task04.exception.ArrayNoSortException;


import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        int[] ms=new int[5];
        for(int i=0;i< 5;i++){
            ms[i]=i;
        }
        System.out.println(ms);
        sort(ms);
        System.out.println(ms);
        try {
            int index=binarySearch(ms,3);
            System.out.println(index);
        }catch (ArrayNoSortException n){

        }

    }
    public static int binarySearch(int[] ms,int key) throws ArrayNoSortException{
        int index=-1;
        if(areArraySorted(ms)) {
            index = Arrays.binarySearch(ms, key);
        }
        else{
            throw new ArrayNoSortException("Массив не отсортирован");
        }
        return index;
    }
    private static boolean areArraySorted(int[] ms){
        for(int i=0;i<ms.length-1;i++){
            if(ms[i]>ms[i+1]){
                return false;
            }
        }
        return true;
    }
}
