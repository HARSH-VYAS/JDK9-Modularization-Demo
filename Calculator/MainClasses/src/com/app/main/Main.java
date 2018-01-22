package com.app.main;

import com.app.calculate.*;

public class Main {

    public static void  main(String args[]){

        Calculate c = new Calculate();

        System.out.println(c.add(5,6));
        System.out.println(c.subtract(5,6));
        System.out.println(c.multiply(5,6));
        System.out.println(c.divide(5,6));
        System.out.println(c.modulo(5,6));
        System.out.println(c.helperFunction("pow",2,10));
        System.out.println(c.helperFunction("max",11,10));
        System.out.println(c.helperFunction("min",2,10));

    }
}
