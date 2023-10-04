package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;


    private void fillQueue() {
        for (char c = '0'; c < '9'; c++) {
            pr0q.add(Character.valueOf(c));

        }
    }
    @Before // This method is called BEFORE each test execution
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
        fillQueue();
    }

    @After // This method is called AFTER each test execution
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test // This is a test method
    public void queueTest() {
        assertEquals(this.pr0q.CAPACITY-1, this.pr0q.getQueue().size());

        assertEquals(this.pr0q.clearFullQueue(), new String("0 1 2 3 4 5 6 7 8 "));

        assertEquals(0, this.pr0q.getQueue().size());
    }

}
