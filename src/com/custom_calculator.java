package com;

import java.util.Scanner;

class Invalidinputexception extends Exception{
    public Invalidinputexception(String str){
        super(str);
    }
}
class divideexception extends Exception{
    public divideexception(String str){
        super(str);
    }
}
class MaxInput extends Exception{
    public MaxInput(String str){
        super(str);
    }
}
class MaxMultiplier extends Exception{
    public MaxMultiplier(String str){
        super(str);
    }
}

class calculator{
    double a ;
    double b ;
    calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your first number : ");
        this.a = sc.nextDouble();
        System.out.print("enter your second number : ");
        this.b = sc.nextDouble();
    }
    double add() throws Invalidinputexception , MaxInput{
        if (a>10000 || b>10000){
            throw new MaxInput("your input is too much high.");
        }
        else if (a==8 && b==9 || a==9 && b==8){
            throw new Invalidinputexception("8 and 9 multiplication is not allowed");
        }
        return a + b;
    }
    double sub() throws MaxInput , Invalidinputexception{
        if (a>10000 || b>10000){
            throw new MaxInput("your input is too much high.");
        }
        else if (a==8 && b==9 || a==9 && b==8){
            throw new Invalidinputexception("8 and 9 subtraction is not allowed");
        }
        return a - b;
    }
    double mul() throws MaxMultiplier , MaxInput{
        if (a>10000 || b>10000){
            throw new MaxInput("your input is too much high.");
        }
        else if (a>7000 || b>7000){
            throw new MaxMultiplier("Multiplier can't be greater that 7000 ");
        }
        return a * b;
    }
    double div() throws divideexception {
        if (b==0){
            throw new divideexception("anything canot be divided by zero");
        }
        return a / b;
    }
}

public class custom_calculator {
    public static void main(String[] args){
        calculator cc = new calculator();

        try {
            System.out.println("Addition: " + cc.add());
        } catch (Exception e) {
            System.out.println("Addition Error: " + e.getMessage());
        }

        try {
            System.out.println("Subtraction: " + cc.sub());
        } catch (Exception e) {
            System.out.println("Subtraction Error: " + e.getMessage());
        }

        try {
            System.out.println("Division: " + cc.div());
        } catch (Exception e) {
            System.out.println("Division Error: " + e.getMessage());
        }

        try {
            System.out.println("Multiplication: " + cc.mul());
        } catch (Exception e) {
            System.out.println("Multiplication Error: " + e.getMessage());
        }
    }
}

// Step-by-Step Flow:

//1. cc.div() is called
//2. Inside div(): b==0 is true
//3. throw new divideexception("anything canot be divided by zero") executes
//4. This divideexception object is caught by catch (Exception e)
//5. 'e' now refers to that specific divideexception object .
//6. e.getMessage() returns "anything canot be divided by zero"

