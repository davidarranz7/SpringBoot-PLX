package org.example;

public record Book (String title, double price){
    public String formattedTittle(){

        return this.title.toUpperCase();
    }
}

