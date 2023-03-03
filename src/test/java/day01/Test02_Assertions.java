package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions {
    @Test
    void testFindMinimum(){
        assertEquals(14,Math.min(14,35));

        //assertTrue()-->if return true it will pass

        assertTrue(10.5==Math.min(10.5,16.8));

        //assertFalse()-->if it returns false it will pass
        assertFalse(20==Math.min(23,17));
    }

    @Test
    void testArray(){
        String str="Unit testing improves code quality";
        String[] actualArray=str.split(" ");
        String[] expectedArray={"Unit","testing","improves","code","quality"};

        assertTrue(Arrays.equals(expectedArray,actualArray));

    }


}
