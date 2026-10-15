package org.example;
public class Main {
    public static void main(String[] args) {

        //*Book book = new Book("clean", 100);
        //System.out.println("Titulo: " + book.title() + "Precio: " + book.price());
        //System.out.println(book.formattedTittle());

        //Product product = new Product("Libro1", 100);
        //System.out.println(product.discountPrice(20));

        Book book1 = new Book("el señor", 10);
        Book book2 = book1;

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
    }
}