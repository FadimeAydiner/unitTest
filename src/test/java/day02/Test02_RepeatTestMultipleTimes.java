package day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test02_RepeatTestMultipleTimes {
    @RepeatedTest(3)
    void testSubstring(){
        assertEquals("Java","Java is important".substring(0,4));
        System.out.println("testSubstring() executed");
    }

    //test for addExact
    @RepeatedTest(5)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
    }
    Random rn=new Random();
    @RepeatedTest(5)
    @Disabled//this test method will not execute when we run tests on class level
    void testMathExactWithRandom(){
        int num1=rn.nextInt(10);
        int num2=rn.nextInt(10);
        assertEquals(num1+num2,Math.addExact(num1,num2));
        System.out.println("num1:"+num1+" num2:"+num2);

    }
}
