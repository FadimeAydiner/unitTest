package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test05_TestingExceptions {
    @Test
    void testException(){
        String str="Java apps are tested by JUnit";
        assertThrows(NullPointerException.class,()->{
            System.out.println("testException() executed");
            str.length();
        });
    }

    //test method for division
    @Test
    void testException2(){
        int num1=5;
        int num2=0;
        assertThrows(ArithmeticException.class,()->{
            System.out.println(num1/num2);
        });

        //RunTimeException will also pass but it will cause performance,since it is broad


    }
    @Test

    void testException3(){
        int num1=5;
        int num2=0;
        assertThrows(ArithmeticException.class,()->divide(num1,num2));
    }
    private int divide(int num1,int num2){
        return num1/num2;
    }
}
