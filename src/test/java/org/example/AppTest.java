package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest{
    @Test
    public void test(){
        String str ="Hello";
        Assertions.assertEquals("Hello", str);
    }
}
