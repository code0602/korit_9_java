package com.korit.study.ch04;

import java.util.Scanner;

public class Controller02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        String name = scanner.nextLine();



        switch (1) {
            case  1 :
                System.out.println("1");

            case 2 :
                System.out.println("2");
                break;
            case 3 :
                System.out.println("3");
            default:
                System.out.println("나머지");
        }
    }
}
