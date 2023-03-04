package day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Test05_Task1_RemoveAFromFirstTwoCharsTest {

    Task1_RemoveAFromFirstTwoChars removeA;
    @BeforeEach
    void setUp() {
        removeA=new Task1_RemoveAFromFirstTwoChars();
        System.out.println("BeforeEach executed");
    }

    @AfterEach
    void tearDown() {
        removeA=null;
        System.out.println("AfterEach executed");
    }

    @ParameterizedTest
    @CsvSource(value={
            "BB,AABB",
            "BAB,ABAB",
            "'',AA"
    })
    void deleteAIfItIsFoundInFirstTwoChars(String s1,String s2) {
        assertEquals(s1,removeA.deleteAIfItIsFoundInFirstTwoChars(s2));

    }
}