package _0020validparentheses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void validTest(){
//        assertEquals(true, ValidParentheses.valid("{}"));
//        assertEquals(true, ValidParentheses.valid("{()}"));
//        assertEquals(true, ValidParentheses.valid("({[()]})"));
//        assertEquals(false, ValidParentheses.valid("{}]"));
        assertEquals(false, ValidParentheses.valid("(("));
//        assertEquals(false, ValidParentheses.valid("({}]"));
    }
}
