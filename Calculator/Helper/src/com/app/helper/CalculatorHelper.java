package com.app.helper;

public class CalculatorHelper {



    public int helpCalculate(String name, int value1, int value2){

        String functionName = name;
        int ans = 0;

        switch (functionName){

            case "pow":
                int pow = value2;
                ans = calculatePow(value1,pow);
                break;

            case "min":
               ans = calculateMin(value1,value2);
                break;

            case "max":
              ans = calculateMax(value1,value2);
                break;

        }

        return ans;

    }

    public int calculatePow(int value, int power){

        int temp;

        if(power ==0)
            return 1;
        temp = calculatePow(value,power/2);

        if(power%2==0)
            return temp * temp;
        else{
            if(power >0)
                return value*temp*temp;
            else
                return (temp*temp)/value;
        }

    }


    public int calculateMin(int value1, int value2){

        return (value1<value2)? value1:value2;
    }

    public int calculateMax(int value1, int value2){

        return (value1 > value2)? value1:value2;
    }


}
