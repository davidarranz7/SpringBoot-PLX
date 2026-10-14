package org.example;
public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Great Gatsby", 10.99);
        System.out.println(book.title());
        System.out.println(book.price());
    }
}