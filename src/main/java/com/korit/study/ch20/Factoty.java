package com.korit.study.ch20;

public class Factoty {
    private  static int id;
    private static String name;

    public Factoty(String name) {
        this.name = name;

    }
    public static Product createProduct(String name) {
        return  new Product(++id,name);

    }

    @Override
    public String toString() {
        return "Factoty{" +
                "name='" + name + '\'' +
                '}';
    }
}
