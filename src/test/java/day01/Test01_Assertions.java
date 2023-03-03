package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {
    /*
        Starting from Junit%, we dont need to erite public access modifier
        testMethod name is suggested to start with "testNameOfMethod"
     */
    @Test
    public void test(){

    }
    //method to test length of string
    @Test
    public void testLength(){
        String str="Hello World";
        int actualValue=str.length();
        int expectedValue=11;
        assertEquals(expectedValue,actualValue);
    }
    //test uppercase method from string class
    @Test
    public void testUpperCase(){
        String actualStr="Hello".toUpperCase();

        String expectedStr="HELLO";
        assertEquals(expectedStr,actualStr,"it is not expected");
    }

    //testing Math.addExact()
    @Test
    void testSum(){
        int num1=10;
        int num2=13;
        int actualValue=Math.addExact(num1,num2);
        int expectedValue=23;
       assertEquals(expectedValue,actualValue);
    }


    //we do not need to create seperate variable

    //string.Contains()
    @Test
    void testContains(){
        assertEquals(false,"Java".contains("z"));
    }
}
