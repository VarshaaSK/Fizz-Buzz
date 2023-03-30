package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    FizzBuzz buzz = new FizzBuzz(55);
    FizzBuzz fizz = new FizzBuzz(9);

    @Test
    void toReturnFizz(){



        ///Arrange
        String expectedString = "Fizz";

        //Act
        String actualString = fizz.checkNumber();

        //Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    void toReturnBuzz(){


        //Arrange
        String expectedString = "Buzz";

        //Act
        String actualString = buzz.checkNumber();

        //Assert
        assertEquals(expectedString, actualString);
    }

   @Test
   void toReturnNumberAsString(){

        FizzBuzz numberInString = new FizzBuzz(94);

        String expectedValue = "94";

        String actualValue = numberInString.checkNumber();

        assertEquals(expectedValue, actualValue);
   }

    @Test
    void toThrowExceptionWhenNumberIsMoreThan100(){
        FizzBuzz numberAsString = new FizzBuzz(211);
        assertThrows(IllegalArgumentException.class, () -> numberAsString.checkNumber());
    }

    @Test
    void toReturnFizzWithNumber3(){
        FizzBuzz fizzWithNumber3 = new FizzBuzz(33);

        String expectedValue = "Fizz";

        String actualValue = fizzWithNumber3.checkNumber();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnFizzWithNumber5(){
        FizzBuzz fizzWithNumber5 = new FizzBuzz(55);

        String expectedValue = "Buzz";

        String actualValue = fizzWithNumber5.checkNumber();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnFizzBuzz(){

        FizzBuzz fizzbuzz = new FizzBuzz(30);
        String expectedString = "FizzBuzz";

        String actualString = fizzbuzz.checkNumber();

        assertEquals(expectedString, actualString);
    }
}
