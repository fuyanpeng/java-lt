package _0008stringtoint;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntTest {

    @Test
    public void test(){
        assertEquals(0, StringToInt.myaoit("asd"));
        assertEquals(1, StringToInt.myaoit("1asd"));
        assertEquals(2, StringToInt.myaoit("   2asd"));
        assertEquals(3, StringToInt.myaoit("    3asd"));
        assertEquals(0, StringToInt.myaoit("    asd123"));
        assertEquals(456, StringToInt.myaoit("456asc"));
        assertEquals(-123, StringToInt.myaoit(" -123a456asc"));
        assertEquals(0, StringToInt.myaoit("      "));
        assertEquals(42, StringToInt.myaoit("42      "));
    }
}
