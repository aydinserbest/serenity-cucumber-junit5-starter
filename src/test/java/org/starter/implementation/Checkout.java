package org.starter.implementation;

import java.util.HashMap;
import java.util.Map;

public class Checkout {
    private int runningTotal = 0;

    public void addToBasket(int count, int price) {
        runningTotal += (count * price);
    }

    public int total() {
        return runningTotal;
    }
}
