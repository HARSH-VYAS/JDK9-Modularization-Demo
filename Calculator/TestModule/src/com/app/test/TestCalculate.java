package com.app.test;

import com.app.calculate.Calculate;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestCalculate {

    public static Calculate calculate;

    @BeforeClass
    public static void createInstance(){
        calculate = new Calculate();
    }

    @Test
    public void TestAddition(){
        assertEquals(10,calculate.add(5,5));
        assertNotEquals(11,calculate.add(5,5));
    }

    @Test
    public void TestSubtaction(){
        assertEquals(0,calculate.subtract(5,5));
        assertNotEquals(11,calculate.subtract(5,5));
    }

    @Test
    public void TestDivision(){
        assertEquals(1,calculate.divide(5,5));
        assertNotEquals(11,calculate.divide(5,5));
    }

    @Test
    public void TestMultiplication(){
        assertEquals(25,calculate.multiply(5,5));
        assertNotEquals(11,calculate.multiply(5,5));
    }

    @Test
    public void TestModulo(){
        assertEquals(0,calculate.modulo(5,5));
        assertNotEquals(11,calculate.modulo(5,5));
    }

    @Test
    public void TestHelperFunction(){
        assertEquals(1024,calculate.helperFunction("pow",2,10));
        assertEquals(10,calculate.helperFunction("max",2,10));
        assertEquals(2,calculate.helperFunction("min",2,10));
    }
}
