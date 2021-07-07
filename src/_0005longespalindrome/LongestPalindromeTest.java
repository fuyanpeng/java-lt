package _0005longespalindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeTest {

    @Test
    public void test(){
        LongestPalindrome o = new LongestPalindrome();
        assertEquals("", o.longestPalindrome(""));
        assertEquals("a", o.longestPalindrome("a"));
        assertEquals("aa", o.longestPalindrome("aa"));
        assertEquals("aa", o.longestPalindrome("baa"));
        assertEquals("a", o.longestPalindrome("abc"));
        assertEquals("bcb", o.longestPalindrome("abcbc"));
    }
}
