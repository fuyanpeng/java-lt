package _0012integertoroman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvert(){
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XII", IntegerToRoman.convert(12));
    }

}
