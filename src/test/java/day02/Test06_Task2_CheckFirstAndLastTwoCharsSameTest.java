package day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Test06_Task2_CheckFirstAndLastTwoCharsSameTest {

    Task2_CheckFirstAndLastTwoCharsSame object=new Task2_CheckFirstAndLastTwoCharsSame();
    @ParameterizedTest
    @CsvSource(value = {
            "true,BABA",
            "true,AAA",
            "true,AB",
            "false,A"
    })
    void checkIfFirstAndLastTwo(boolean exp,String str) {
        assertEquals(exp,object.checkIfFirstAndLastTwo(str));
    }
}