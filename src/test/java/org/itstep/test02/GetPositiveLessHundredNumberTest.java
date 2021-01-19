package org.itstep.test02;

import org.itstep.task02.exeption.GreatHundredException;
import org.itstep.task02.exeption.NegativeNumberException;
import org.junit.Assert;
import org.junit.Test;

import static org.itstep.task02.Main.getPositiveLessHundredNumber;

public class GetPositiveLessHundredNumberTest {
    @Test
    public void GreatHundredExceptionTestLess(){

        try{
            getPositiveLessHundredNumber(5);
            Assert.assertTrue(true);
        }catch (NegativeNumberException j){
            Assert.assertTrue(false);
        }
        catch (GreatHundredException l){
            Assert.assertTrue(false);
        }
    }
    @Test
    public void GreatHundredExceptionTestBiggest(){
        try{
            getPositiveLessHundredNumber(101);
            Assert.assertTrue(false);
        }catch (NegativeNumberException j){
            Assert.assertTrue(false);
        }
        catch (GreatHundredException l){
            Assert.assertTrue(true);
        };

    }
    @Test
    public void NegativeNumberExceptionTestPositive() {

        try{
            getPositiveLessHundredNumber(5);
            Assert.assertTrue(true);
        }catch (NegativeNumberException j){
            Assert.assertTrue(false);
        }
        catch (GreatHundredException l){
            Assert.assertTrue(false);
        }

    }
    @Test
    public void NegativeNumberExceptionTestNegative() {
        try{
            getPositiveLessHundredNumber(-3);
            Assert.assertTrue(false);
        }catch (NegativeNumberException j){
            Assert.assertTrue(true);
        }
        catch (GreatHundredException l){
            Assert.assertTrue(false);
        };


    }
}
