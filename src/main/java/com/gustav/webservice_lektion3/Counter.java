package com.gustav.webservice_lektion3;

public class Counter {
    private final int id;
    private final int value;

    public Counter(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public int getId() { return id; }
    public int getValue() { return value; }
}
