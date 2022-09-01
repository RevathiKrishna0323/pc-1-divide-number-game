package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int finalNumber = 0;
        try {
            //write logic
            finalNumber = firstNumber / secondNumber;
     //Handle specific exception
        }catch (Exception exception){
            if(firstNumber==0){
                System.err.println("You can't divide zero with positive numbers");
            }

            return exception.toString();
        }
        return String.valueOf(finalNumber);
    }

}
