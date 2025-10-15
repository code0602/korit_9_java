package com.korit.study.ch01;

import java.sql.SQLOutput;
import java.util.Date;


public class Type{
//     논리 자료형
    public static void main(String[] args) {
        boolean open = true;
        open = true;

//     문자 자료형
        char lastName = '김';
        System.out.println(lastName);
//        char firstName = '준일';
//        문자열 자료형
        String firstName = "준일";
        System.out.println(firstName);
        String contents1 = "안녕하세요.\n김준일입니다.";
        System.out.println(contents1);
        String contents2 = """
                안녕하세요.
                김준일입니다.
                """;
        System.out.println(contents2);
//      숫자
        double avg = 89.33;
        System.out.println(avg);
        int number = 1000000;
        System.out.println(number);
        int nowTime = (int) new Date().getTime();
        System.out.println(nowTime);
        long longNumber = 2200000000l;
        System.out.println(longNumber);


    }


}
