package com.iitu.kz.abstractFactory;

public abstract class Book {
    private int id;
    private String name;
    private int ageLimit;
    private double cost;

    public Book(int id, String name, int ageLimit, double cost) {
        this.id = id;
        this.name = name;
        this.ageLimit = ageLimit;
        this.cost = cost;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ageLimit=" + ageLimit +
                ", cost=" + cost +
                "}\n";
    }
}
