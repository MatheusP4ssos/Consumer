package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<Product>();



        list.add(new Product("tv", 900.00));
        list.add(new Product("hd", 700.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Celular", 900.00));

        list.forEach(Product::nonStaticPriceUpdate);

        list.forEach(System.out::println);
    }
}