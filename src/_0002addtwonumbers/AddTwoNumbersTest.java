package _0002addtwonumbers;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        ListNode rs = new ListNode(5);
        ListNode check = AddTwoNumbers.addTwoNumbers(new ListNode(2), new ListNode(3));
        assertEquals(rs.val, check.val);
    }
}