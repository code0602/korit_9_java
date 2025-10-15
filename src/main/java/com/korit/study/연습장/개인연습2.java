package com.korit.study.연습장;

public class 개인연습2 {
    public static void main(String[] args) {
        printInfo("이근",32,"경남대");
    }
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }
    public static void printInfo(String name, int age) {
        printInfo(name);
        System.out.println("나이: " + age);
    }
    public static void printInfo(String name, int age , String school) {
        printInfo(name, age);
        System.out.println("학교: " + school);
    }
}
