package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;

    private void fillQueue(LocalDate startDate) {
        for (int i = 0; i < this.pr0q.CAPACITY - 1; i++) {
            pr0q.add(startDate.plusDays(i * 2));
        }
    }

    @Before // This method is called BEFORE each test execution
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
        fillQueue(LocalDate.of(2023, 9, 28));
    }

    @After // This method is called AFTER each test execution
    public void release() {
        this.pr0q = null;
    }

    @org.junit.Test // This is a test method
    public void queueTest() {
        assertEquals(this.pr0q.CAPACITY-1, this.pr0q.getQueue().size());
        assertEquals(this.pr0q.clearFullQueue(),
                "2023-09-28 2023-09-30 2023-10-02 2023-10-04 2023-10-06 " +
                "2023-10-08 2023-10-10 2023-10-12 2023-10-14 ");
        assertEquals(0, this.pr0q.getQueue().size());
    }

}
