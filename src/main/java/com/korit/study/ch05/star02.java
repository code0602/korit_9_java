package com.korit.study.ch05;

public class star02 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                System.out.print("*");
            }
            System.out.print(i == 0 || i == n - 1 ? "": " ");

            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
