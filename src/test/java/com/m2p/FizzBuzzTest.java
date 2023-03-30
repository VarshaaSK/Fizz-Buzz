package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    FizzBuzz buzz = new FizzBuzz(15);
    FizzBuzz fizz = new FizzBuzz(15);
    FizzBuzz numberAsString = new FizzBuzz(15);
    @Test
    void toReturnFizz(){



        ///Arrange
        String expectedString = "Fizz";

        //Act
        String actualString = fizz.multipleOfThree();

        //Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    void toReturnBuzz(){


        //Arrange
        String expectedString = "Buzz";

        //Act
        String actualString = buzz.multipleOfFive();

        //Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    void toReturnNumber(){

        //Arrange
        String expectedString = "15";

        //Act
        String actualstring = numberAsString.notMultipleOfAny();

        //Assert
        assertEquals(expectedString, actualstring);
    }


}
