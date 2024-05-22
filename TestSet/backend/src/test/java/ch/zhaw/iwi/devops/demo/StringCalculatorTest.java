package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));  // Der Test erwartet, dass 0 zurückgegeben wird.
    }
}
