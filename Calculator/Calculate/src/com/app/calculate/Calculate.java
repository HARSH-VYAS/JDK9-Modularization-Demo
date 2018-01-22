package com.app.calculate;

import com.app.helper.CalculatorHelper;

public class Calculate {

    private CalculatorHelper helper;

    public Calculate(){
        helper = new CalculatorHelper();
    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int divide(int a, int b)throws IllegalArgumentException{
        return a/b;
    }

    public int multiply(int a, int b){
        return a*b;
    }


    public int modulo(int a, int b){
        return a%b;
    }

    public int helperFunction(String name, int value1, int value2){

        return helper.helpCalculate(name,value1,value2);

    }


}
