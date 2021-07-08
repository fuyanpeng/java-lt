package _0009palindromeinteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeIntegerTest {

    @Test
    public  void test(){

        assertEquals(false, PalindromeInteger.isPalindromeNumber(0));
        assertEquals(false, PalindromeInteger.isPalindromeNumber(-1));
        assertEquals(false, PalindromeInteger.isPalindromeNumber(10));
        assertEquals(false, PalindromeInteger.isPalindromeNumber(12));
        assertEquals(true, PalindromeInteger.isPalindromeNumber(1));
        assertEquals(true, PalindromeInteger.isPalindromeNumber(121));
        assertEquals(false, PalindromeInteger.isPalindromeNumber(1345));
    }

}
