package _0003lengthoflongestsubstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubStringTest {

    @Test
    public void lengthOfLongestSubString() {
        assertEquals(1, LengthOfLongestSubString.lengthOfLongestSubString("a"));
        assertEquals(3, LengthOfLongestSubString.lengthOfLongestSubString("cxxcs"));
        assertEquals(3, LengthOfLongestSubString.lengthOfLongestSubString("dvdf"));
        assertEquals(5, LengthOfLongestSubString.lengthOfLongestSubString("asdfgasdasd"));
    }
}