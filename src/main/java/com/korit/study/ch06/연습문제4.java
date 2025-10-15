package com.korit.study.ch06;

import java.sql.ResultSet;

public class 연습문제4 {
    public static void main(String[] args) {
        int result = calculate(5, 10, 15, 20);
        System.out.println("결과: " + result);
    }
    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int subtract(int a, int b) { return a - b; }

    // (a + b) * c - d 를 계산하는 함수를
// 위의 함수들을 이용해서 작성하세요
    public static int calculate(int a, int b, int c, int d) {
//        int addreault = add(a, b);
//        int mulresult = multiply(addreault, c);
//        int subresult = subtract(mulresult, d);
        return subtract(multiply(add(a,b), c), d);
        // 여기에 중첩 함수 호출 코드 작성,
    }
}
