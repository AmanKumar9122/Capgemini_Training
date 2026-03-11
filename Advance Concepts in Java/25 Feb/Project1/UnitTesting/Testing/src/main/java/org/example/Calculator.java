package org.example;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public int div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Division by zero is not allowed", e);
        }
    }
}
