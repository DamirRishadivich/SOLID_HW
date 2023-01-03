package org.example;

public class Purchase { // Слишком много всего в классе, нарушение первого принципа SOLID. Перенесем часть функционала в класс Basket.
    protected String title;
    protected int count;
// Здесь хранится название и количество товара.
    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }
}