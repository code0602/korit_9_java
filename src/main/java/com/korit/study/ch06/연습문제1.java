package com.korit.study.ch06;

import com.sun.source.tree.ReturnTree;

import java.util.Date;

public class 연습문제1 {
    public static void main(String[] args) {
        hello();
        hello("[이름]님!");
        System.out.println(제곱(3));

        Date now = new Date();
        System.out.println(now.getHours());
        System.out.println(now.getMinutes());
        System.out.println(현재시간(11, 43));


    }
    // 매개변수 없음, 리턴값 없음
    // "안녕하세요!"를 출력하는 함수를 작성하세요
    public static void hello() {
        System.out.println("안녕하세요,");

    }
    public static void hello(String name) {
        System.out.print("안녕하세요!" + name );
        // 여기에 코드 작성
    }
    public static int 제곱(int number) {
        return number * number;
        // 여기에 코드 작성
    }
    public static String 현재시간(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();

        return hours == nowHours && minutes == nowMinutes ? "현재 시간입니다." : "현재 시간이 아닙니다.";

    }

}
