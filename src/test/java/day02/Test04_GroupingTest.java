package day02;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_GroupingTest {
    //we can group related tests within same classes. to make them more readable

    @Nested
    class testMultiple{

        @ParameterizedTest
        @CsvSource(value={
                "-12,3,-4",
                "-12,-3,4",
                "12,-3,-4"
        })
        void testMultiplicationWithNoneZero(int result,int num1,int num2){
            assertEquals(result,Math.multiplyExact(num1,num2));
        }

        @ParameterizedTest
        @CsvSource(value={
                "0,0,-4",
                "0,-3,0",
                "0,0,0"
        })
        void testMultiplicationWithZero(int result,int num1,int num2){
            assertEquals(result,Math.multiplyExact(num1,num2));
        }
    }//end of first group

    @Nested
    class testSum{
        @ParameterizedTest
        @CsvSource(value={
                "-1,-4,3",
                "1,4,-3",
                "-7,-3,-4"
        })
        void testSumWithoutZero(int result,int num1,int num2){
            assertEquals(result,Math.addExact(num1,num2));
        }

        @ParameterizedTest
        @CsvSource(value={
                "-4,-4,0",
                "-3,0,-3",
                "-4,0,-4"
        })
        void testSumWithZero(int result,int num1,int num2){
            assertEquals(result,Math.addExact(num1,num2));
        }

    }//end of second group
}
