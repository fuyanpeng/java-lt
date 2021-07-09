package _0013romantointeger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void testConvert() {
        assertEquals(1, RomanToInteger.convertRoman("I"));
        assertEquals(4, RomanToInteger.convertRoman("IV"));
        assertEquals(9, RomanToInteger.convertRoman("IX"));
        assertEquals(11, RomanToInteger.convertRoman("XI"));
    }
}
