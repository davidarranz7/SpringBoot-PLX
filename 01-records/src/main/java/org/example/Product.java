package org.example;

public record Product(String name, double price) {

    public double discountPrice(double percentage) {
        double precioFinal = price * (1-percentage/100);
        return precioFinal;
    }
}
