package com.iitu.kz.builderFactoryPattern;

import com.iitu.kz.abstractFactory.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private int id;
    private String username;
    private List<Book> borrowedBooks = new ArrayList<>();
    private Boolean membership;
    private int age;

    public User(){}

    public User(int id, String username, Boolean membership, int age) {
        this.id = id;
        this.username = username;
        this.membership = membership;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void borrow(Book borrowedBook) {
        if (borrowedBook.getAgeLimit() > this.age) {
            System.out.println("Sorry, you can't borrow this book");
            return;
        }
        this.borrowedBooks.add(borrowedBook);
    }

    public void setMembership(Boolean membership) {
        this.membership = membership;
    }

    public double calculate() {
        double sum = 0.0;
        for(Book book: borrowedBooks){
            sum += book.getCost();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                ", membership=" + membership +
                ", age=" + age +
                '}';
    }
}
