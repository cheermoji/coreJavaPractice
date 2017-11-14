package coreJavaPractice.equalsAndHash;

import java.util.Objects;

/**
 * Created by Moji on 20-Oct-17.
 * mojtaba.nasehzadeh@gmail.com
 */
public class MojiEquals {

    public static void main(String[] args) {
        Product p1 = new Product(100);
        Product p2 = new Product(100);
        System.out.println("p1 == p2 " + (p1 == p2));
        System.out.println("p1 equals p2 " + (p1.equals(p2)));
        System.out.println("p1 hashcode " + (p1.hashCode()));
        System.out.println("p2 hashcode " + (p2.hashCode()));

    }
}

class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof Product) {
            if (this.price == ((Product) obj).getPrice()) {
                if (this.hashCode() == obj.hashCode()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int)price * 99 + Objects.hashCode(this.price);
    }
}
