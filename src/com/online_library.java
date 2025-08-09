package com;

import java.util.ArrayList;

class Library {
    private ArrayList<String> books = new ArrayList<>();
    
    void addBook(String book) {
        books.add(book);
        System.out.println(book + " has been added");
    }
    
    void showBooks() {
        System.out.println("Available Books:");
        books.forEach(book -> System.out.println("* " + book));
    }
    
    void issueBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " has been issued!");
        } else {
            System.out.println("This book does not exist");
        }
    }
    
    void returnBook(String book) {
        addBook(book);
    }
}
public class online_library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("Rich Dad Poor Dad");
        centralLibrary.showBooks();
        centralLibrary.issueBook("Think and Grow Rich");
        centralLibrary.issueBook("Harry Potter");
        centralLibrary.showBooks();
        centralLibrary.returnBook("Think and Grow Rich");
        centralLibrary.showBooks();
    }
}
