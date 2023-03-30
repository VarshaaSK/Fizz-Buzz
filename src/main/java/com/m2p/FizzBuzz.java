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


    public String checkNumber(){
        String numberAsString = Integer.toString(number);
        if(validityCheck()){
            if(number % 3 != 0 && number % 5 != 0){
                return numberAsString;
            }
            else if(number % 3 == 0 && number % 5 == 0){
                return "FizzBuzz";
            }
            else if(number % 3 == 0 || String.valueOf(number).contains("3")){
                return "Fizz";
            }
            else if(number % 5 == 0 || String.valueOf(number).contains("5")){
                return "Buzz";
            }
            else{
                return numberAsString;
            }
        }
        throw new IllegalArgumentException();
    }
}

//String.valueOf(inputNumber).contains("3")
