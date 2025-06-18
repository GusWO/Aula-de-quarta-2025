package com.acme.sample;

import java.util.UUID;

/**
 *
 * @author gusta
 */
public class Task extends Thread {

    private int id;
    //private char character;
    private long[] executions;

    public Task(int id, /*char character, */ long[] executions) {
        //this.character=character;
        this.id = id;
        this.executions = executions;
    }

    @Override
    public void run() {

        while (true) {
            executions[id] = executions[id] + 1;

        }

    }
}
