package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add("")); // Der Test erwartet, dass 0 zurückgegeben wird.
    }

    @Test
    public void testSingleNumber() {
        StringCalculator calc = new StringCalculator();
        assertEquals(1, calc.add("1")); // Der Test erwartet, dass 1 zurückgegeben wird.
    }

    @Test
    public void testTwoNumbers() {
        StringCalculator calc = new StringCalculator();
        assertEquals(3, calc.add("1,2")); // Der Test überprüft, ob zwei Zahlen korrekt summiert werden.
    }

    @Test
    public void testMultipleNumbers() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1,2,3")); // Der Test überprüft, ob mehrere Zahlen korrekt summiert werden.
    }

    @Test
    public void testNewLineDelimiter() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3")); // Der Test überprüft, ob Zahlen, getrennt durch Zeilenumbrüche und Kommas,
                                             // korrekt summiert werden.
    }

    @Test
    public void testCustomDelimiter() {
        StringCalculator calc = new StringCalculator();
        assertEquals(3, calc.add("//;\n1;2")); // Der Test überprüft, ob Zahlen, getrennt durch ein benutzerdefiniertes
                                               // Trennzeichen, korrekt summiert werden.
    }
}
