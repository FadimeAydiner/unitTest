package day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test06_DisplayName {
    //method name should be understandable,if it too long or if you need
    //to explain in different way then you can @Displayname()

    @DisplayName("Exception if Integer.parseInt() is not a integer")
    @Test
    void testException(){
        String str="Hello123";
        assertThrows(NumberFormatException.class,()->{
            Integer.parseInt(str);
        });
    }
}