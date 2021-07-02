package struct._0001cyclequeue;

import org.junit.Test;

import static org.junit.Assert.*;


public class CycleQueueTest {

    @Test
    public void Test(){
        CycleQueue q = new CycleQueue(3);
        assertEquals(false, q.dequeue());
        assertEquals(true, q.enqueue("a"));
        assertEquals(true, q.enqueue("b"));
        assertEquals(false, q.enqueue("c"));
        assertEquals(true, q.dequeue());
        assertEquals(true, q.dequeue());
        assertEquals(false, q.dequeue());

    }
}
