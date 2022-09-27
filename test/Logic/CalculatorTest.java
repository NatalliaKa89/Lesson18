package Logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum(){
        // arrange
        int a = 10;
        int b = 3;
        int expected = 13;

        // act
        int actual = Calculator.sum(a, b);

        // assert
        if(expected != actual){
            Assert.fail();
        }
    }
    @Test
    public void testSub(){
        // arrange
        int a = 10;
        int b = 3;
        int expected = 7;

        // act
        int actual = Calculator.sub(a, b);

        // assert
        if(expected != actual){
            Assert.fail();
        }
    }
    @Test
    public void testMul(){
        // arrange
        int a = 2;
        int b = 3;
        int expected = 6;

        // act
        int actual = Calculator.mul(a, b);

        // assert
        if(expected != actual){
            Assert.fail();
        }
    }
    @Test
    public void testDiv(){
        // arrange
        int a = 6;
        int b = 3;
        int expected = 2;

        // act
        int actual = Calculator.div(a, b);

        // assert
        if(expected != actual){
            Assert.fail();
        }
    }

}
