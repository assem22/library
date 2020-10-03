package com.iitu.kz.singleton;

import com.iitu.kz.abstractFactory.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setBook(Book book) {
        this.bookList.add(book);
    }

    public Book getBook(int index){
        return this.bookList.get(index);
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList:\n" + bookList +
                '}';
    }

    public static synchronized Library getInstance() {
        if (instance == null){
            instance = new Library();
        }
        return instance;
    }
}
