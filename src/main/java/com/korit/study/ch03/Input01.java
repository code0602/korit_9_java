package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
      InputStream inputStream = System.in;
//        s라는 변수를 선언했다 Scanner 자료형으로, 뒤에 대입하는 자료도 스캐너 자료형
        Scanner s = new Scanner((inputStream));
        String str = s.nextLine();
        System.out.println(String.format("입력값: %s" , str));

        String address = s.nextLine();
//        s.nextLine -> 띄워쓰기를 포함한 문자열
        System.out.println("주소: " + address);
        System.out.println();

            }
}
