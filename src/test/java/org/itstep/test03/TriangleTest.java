package org.itstep.test03;

import org.itstep.task03.Triangle;
import org.itstep.task03.exeption.CreateTriangleException;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    Triangle triangle;
    @Test
    public void TriangleCreateNormalTest(){
        try {
            triangle = new Triangle(25,15,20);
            Assert.assertTrue(true);
        }catch (CreateTriangleException l){
            Assert.fail();
        }

    }
    @Test
    public void TriangleCreateImposibleTest(){
        try {
            triangle = new Triangle(3,10,50);

            Assert.fail();
        }catch (CreateTriangleException l){
            Assert.assertTrue(true);
        }

    }
}
