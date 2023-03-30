package com.m2p;

public class FizzBuzz {

    private int number;
    FizzBuzz(int number){
        this.number = number;
    }

    public boolean validityCheck(){
        if(number >= 1 && number <= 100){
            return true;
        }
        return false;
    }


    public String multipleOfThree() {
        if(validityCheck()){
            if(number % 3 == 0){
                return "Fizz";
            }
        }
        throw new IllegalArgumentException();
    }

    public String multipleOfFive() {
        if(validityCheck()){
            if(number % 5 == 0){
                return "Buzz";
            }
        }
        throw new IllegalArgumentException();
    }

    public String notMultipleOfAny() {
        if(validityCheck()){
            if(number % 3 != 0 && number % 5 != 0){
                return Integer.toString(number);
            }
        }
        throw new IllegalArgumentException();
    }
}
