package day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test01_ParameterizedTest {

    //test length of string if it is grater than 0

    @Test
    void testLength(){
        assertTrue("Fadime".length()>0);
        assertTrue("Eyüp".length()>0);
        assertTrue("Bilge Nur".length()>0);
        assertTrue("Miraç".length()>0);
    }

    //test the same similar case with Parameterize testing
    @ParameterizedTest
    @ValueSource(strings = {"Fadime","Eyüp","Bilge Nur","Miraç"})
    void testParameterizedTest(String str){
        assertTrue(str.length()>0);
    }
    @Test
    void testUpperCase(){
        String str1="Hello";
        String str2="Java";
        String str3="UnIt";
        String str4="Test";

        assertEquals("HELLO",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("UNIT",str3.toUpperCase());
        assertEquals("TEST",str4.toUpperCase());
    }

    //Using paramaterize test

    @ParameterizedTest
    @CsvSource(value = {
            "HELLO, Hello",
            "JAVA, Java",
            "UNIT, UnIt",
            "TEST, Test"
    })//"expectedValue,actualValue"
    void testUpperCaseUsingParameterizedTest(String str1,String str2){
        assertEquals(str1,str2.toUpperCase());
    }

    //test contains() using with Parameterize testing

    /*
        if we want to test:
            "java" contains(a)---> assertTrue
            "junit" contains(u)---->assertTrue
            "hello" contains(a)---->assertFalse
     */

    @ParameterizedTest
    @CsvSource(value = {
            "true, java, a",
            "true, junit, u",
            "false, hello, a"
    })
    void testContainsUsingParameterizedTest(boolean b,String s1,String s2){
        assertEquals(b,s1.contains(s2));
    }
}
