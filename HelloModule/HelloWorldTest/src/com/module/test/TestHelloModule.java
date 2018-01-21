package com.module.test;
import com.module.HelloWorld.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelloModule {

    private static Main mainObject;
    @BeforeClass
    public static void createInstance(){
        mainObject = new Main();
    }

    @Test
    public void testPrint(){
       assertEquals("Hello world! This is my first Module",mainObject.printHello());
    }
}
