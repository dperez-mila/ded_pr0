package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import java.time.LocalDate;

public class PR0Queue {

    public final int CAPACITY = 10;

    private Queue<LocalDate> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<LocalDate> getQueue() {
        return this.queue;
    }

    public void add(LocalDate date) {
        this.queue.add(date);
    }
}
