package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요: ");
        String name = scanner.next();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.print("학년을 입력하세요: ");
        int schoolyear = scanner.nextInt();

        System.out.print("국어점수를 입력하세요: ");
        double koreanscore = scanner.nextDouble();

        System.out.print("영어점수를 입력하세요: ");
        double englishscore = scanner.nextDouble();


        System.out.print("수학점수를 입력하세요: ");
        double mathscore = scanner.nextDouble();
        scanner.nextLine();

        double totalScore = mathscore + koreanscore + englishscore ;
        double average = totalScore / 3;
        String grade = average >= 95 ? "A+" :
                average >= 90 ? "A" :
                        average >= 85 ? "B+" :
                                average >= 80 ? "B" :
                                        average >= 75 ? "C+" :
                                                average >= 70 ? "C" :
                                                        average >= 65 ? "D+" :
                                                                average >= 60 ? "D" : "F";



        System.out.print("자기소개를 입력하세요: ");
        String introduceyourself = scanner.nextLine();
        scanner.close();
        System.out.println("===학생 정보===");
        System.out.println(String.format("""
                이름: %s
                나이: %d세 
                성적:
                  국어: %.2f점
                  영어: %.2f점
                  수학: %.2f점
                  평균: %.2f점 (학점: %s)
                자기소개: %s""",name, age, koreanscore, englishscore, mathscore, average,grade, introduceyourself
                ));




    }
}
