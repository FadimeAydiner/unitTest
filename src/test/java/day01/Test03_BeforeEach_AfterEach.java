package day01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {
    /*
    @BeforeEach and @AfterEach mean the annotated method should be executed
    before or after each test method in the test class
     */

    String str;
    @BeforeEach
    void beforeEach(){
        str="Test method should be simple";
        System.out.println("beforeEach() executed. Value of str is:"+str);
    }

    @AfterEach
    void afterEach(){
        str="";
        System.out.println("afterEach() executed. Value of str is:"+str);

    }

    @Test
    void testArrays(TestInfo info){//to display running methos information
        String[] actualArray=str.split(" ");
        String[] expectedArray={"Test","method","should","be","simple"};
        System.out.println(info.getDisplayName()+" executed");
        assertTrue(Arrays.equals(expectedArray,actualArray));
    }

    @Test
    void testStringLength(TestInfo info){
        int actualValue=str.length();
        int expectedValue= 28;
        assertEquals(expectedValue,actualValue);
        System.out.println(info.getDisplayName()+" executed");
    }

}
