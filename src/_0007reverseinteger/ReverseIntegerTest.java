package _0007reverseinteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverse(){
        assertEquals(0, ReverseIngeger.reverse(0));
        assertEquals(1, ReverseIngeger.reverse(1));
        assertEquals(1, ReverseIngeger.reverse(10));
        assertEquals(3105, ReverseIngeger.reverse(5013));
    }
}
