package com.umbrella.exer_9_4;

import java.io.Serializable;

public class Product implements Serializable {
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " " + price;
    }
}
