package com.korit.study.ch08;

import java.util.IdentityHashMap;
import java.util.Scanner;
// 클래스 자바 객체에 대해서 미리 예습해서 오기
public class Array연습02 {
    public static String[] names = new String[] {"김준일", "김준이"};

    public static void main(String[] args) {

        System.out.println("<<이름 관리 시스템>>");
        메인화면();

    }

    public static void 메인화면() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1.이름 추가");
            System.out.println("2.이름 조회");
            System.out.println("3.이름 수정");
            System.out.println("4.이름 삭제");
            System.out.println("0.종료 ");
            System.out.println("선택:  ");

            int seletNumber = scanner.nextInt();
            scanner.nextLine();

            if (seletNumber == 0 ) {
                isExit = true;
            } else if (seletNumber == 1) {
                이름추가기능();
            }

        }

    }
    public static void 이름추가기능() {
        Scanner scanner = new Scanner(System.in);
        String newName =null;
        while (true){
            System.out.println("[이름 추가기능]");
            System.out.print("이름입력: ");
            newName = scanner.nextLine();

            if (newName == null) {
                break;
            }
            System.out.println("중복된 이름입니다.");
        }

    }

}
