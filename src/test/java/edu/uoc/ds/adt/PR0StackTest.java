package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    private void fillStack() {
        for (char c = '0'; c < '9'; c++) {
            pr0q.push(Character.valueOf(c));
        }
    }

    @Before // This method is called BEFORE each test execution
    public void setUp() {
        this.pr0q = new PR0Stack();

        assertNotNull(this.pr0q.getStack());
        this.fillStack();

    }

    @After // This method is called AFTER each test execution
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test // This is a test method
    public void stackTest() {

        assertEquals(this.pr0q.CAPACITY-1, this.pr0q.getStack().size());

        assertEquals(this.pr0q.clearAllStack(), new String("8 7 6 5 4 3 2 1 0 "));

        assertEquals(0, this.pr0q.getStack().size());
    }
}
