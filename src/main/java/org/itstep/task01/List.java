package org.itstep.task01;

import org.itstep.task01.exeption.EmptyListException;
import org.itstep.task01.exeption.FullListException;

public class List {
    private Object[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }
   
    public Object get(int idx) {
        return obj[idx];
    }

    public void add(Object item)throws FullListException {
        if (cur==size){
            throw new FullListException("Попытка добавления в заполенный массив");
        }
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyListException {
        if (cur<1){
            throw new EmptyListException("Попытка удаления из пустого массива");
        }
        obj[--cur] = null;
    }
}
