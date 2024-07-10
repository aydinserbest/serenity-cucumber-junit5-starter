package org.starter.implementation;

public class Checkout {
    private int basketTotal = 0;
    public void add(int count, int price) {
        basketTotal += count * price;
    }

    public int getRunningTotal() {
        return basketTotal;
    }
}
