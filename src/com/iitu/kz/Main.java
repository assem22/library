package com.iitu.kz;

import com.iitu.kz.abstractFactory.*;
import com.iitu.kz.builderFactoryPattern.*;
import com.iitu.kz.singleton.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    private static List<User> users = new ArrayList<>();
    private static Library library = Library.getInstance();
//    private static UserBuilder builder;

    public static void main(String[] args) {
//        PupilBuilder newpupil = new PupilBuilder();
//        users.add(new Pupil().setId(1).setUsername("Pupil User 1").setAge(13).setMembership(true).getResult());
//        users.add(newpupil.setId(4).setUsername("asads").setMembership(true).build());

        library.setBook(new ForAdults().comedyWithLimitedAge(1,"ComedyBook", 23.23));
        library.setBook(new ForChildren().fantasyWithLimitedAge(2,"FantasyForChildren", 45.87));

        while (true) {
            menu();
        }
    }

    private static void menu() {
        System.out.println("[1] Create a student\n" +
                "[2] Create pupil\n" +
                "[3] List of books\n" +
                "[4] See cost of my borrowed books\n" +
                "[5] list of users");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                createStudent();
                break;
            case 2:
                createPupil();
                break;
            case 3:
                listOfBook();
                break;
            case 4:
                costOfBooks();
                break;
            case 5:
                System.out.println(users);
                break;
        }
    }

    private static void costOfBooks() {
        System.out.println("Enter your id");
        int userId = in.nextInt();
        for (User user: users) {
            if (user.getId() != userId) {
                System.out.println("No user with such id");
                return;
            }
            int index = users.indexOf(user);
            System.out.println(users.get(index).calculate());
        }
    }

    private static void listOfBook() {
        System.out.println("Enter your id");
        int userId = in.nextInt();
        for (User user: users) {
            if (user.getId() != userId) {
                System.out.println("No user with such id");
                return;
            }
            System.out.println(library.toString());
            System.out.println("Enter the id of book that you want to borrow: ");
            int bookId = in.nextInt();
            int index = users.indexOf(user);
            users.get(index).borrow(library.getBook(bookId - 1));
        }
    }

    private static void createStudent() {
        StudentBuilder builder = new StudentBuilder();
        System.out.println("Enter your id");
        int id = in.nextInt();
        System.out.println("Enter your name");
        String name = in.next();
        System.out.println("Enter your age");
        int age = in.nextInt();
        System.out.println("Membership? (true/false)");
        Boolean membership = in.nextBoolean();
        users.add(builder.setId(id).setUsername(name).setMembership(membership).setAge(age).build());
    }

    private static void createPupil() {
        PupilBuilder builder = new PupilBuilder();
        System.out.println("Enter your id");
        int id = in.nextInt();
        System.out.println("Enter your name");
        String name = in.next();
        System.out.println("Enter your age");
        int age = in.nextInt();
        System.out.println("Membership? (true/false)");
        Boolean membership = in.nextBoolean();
        users.add(builder.setId(id).setUsername(name).setMembership(membership).setAge(age).build());
    }
}
