package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SampleClassTest {
    @Test
    void sampleTest(){
        final int number=5;
        SampleClass sampleClass =new SampleClass(number);
        assertEquals(number,sampleClass.getNumber());
    }
  
}