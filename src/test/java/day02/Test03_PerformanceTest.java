package day02;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test03_PerformanceTest {

    //Test method performance which will print elements of integer array
    @Test
    void testPrintPerformance(){
        assertTimeout(Duration.ofSeconds(1),
                ()-> IntStream.rangeClosed(1,10000).forEach(System.out::println));
    }

    @Test
    void testPerformanceAddExact(){
        assertTimeout(Duration.ofSeconds(2),
                ()->IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
    }
}
