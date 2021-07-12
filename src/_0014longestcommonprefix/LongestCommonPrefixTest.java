package _0014longestcommonprefix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void test(){
        String [] strs1 = {"","a"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs1));
        String [] strs2 = {"ac","ad"};
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(strs2));
        String [] strs3 = {"aabb","aacc"};
        assertEquals("aa", LongestCommonPrefix.longestCommonPrefix(strs3));
        String [] strs4 = {"abcd","abxd"};
        assertEquals("ab", LongestCommonPrefix.longestCommonPrefix(strs4));
    }
}
