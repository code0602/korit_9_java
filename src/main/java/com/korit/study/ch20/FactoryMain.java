package com.korit.study.ch20;

public class FactoryMain {
    public static void main(String[] args) {
        Factoty f1 = new Factoty("1공장");
        Factoty f2 = new Factoty("2공장");
        Factoty f3 = new Factoty("3공장");

        Product p1 = f1.createProduct("상품1");
        Product p2 = f1.createProduct("상품2");
        Product p3 = f1.createProduct("상품3");
        Product p4 = f1.createProduct("상품4");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
