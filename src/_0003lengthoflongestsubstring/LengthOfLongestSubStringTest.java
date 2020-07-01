package _0003lengthoflongestsubstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubStringTest {

    @Test
    public void longthOfLongestSubString() {
        assertEquals(1, LengthOfLongestSubString.longthOfLongestSubString("a"));
        assertEquals(3, LengthOfLongestSubString.longthOfLongestSubString("cxxcs"));
        assertEquals(3, LengthOfLongestSubString.longthOfLongestSubString("dvdf"));
        assertEquals(5, LengthOfLongestSubString.longthOfLongestSubString("asdfgasdasd"));
    }
}