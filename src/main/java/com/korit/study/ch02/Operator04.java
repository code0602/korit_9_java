package com.korit.study.ch02;

public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b;
        boolean h = a != b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int n = 20;
        boolean r = (5 <= n) && (n <= 15);

        System.out.println(r);
        a = 10;
        b = 10;
        System.out.println("a" == "a");
        System.out.println(true == true);
        System.out.println(false == false);
        System.out.println('a' == 'a');


        int 키 = 170;
        int 몸무게 = 65;
        double BMI = 몸무게 / ((double)키/100*(double)키/100);
        System.out.println(BMI);
//        초과미만 정수  이상이하 소수점들어갈때~
        boolean 저체중 = BMI < 18.5;
        boolean 정상 = BMI >= 18.5 && BMI <= 24.9;
        boolean 과체중 = BMI >= 25 && BMI <= 29.9;
        boolean 비만 = BMI >= 30;
        System.out.println("저체중: " + 저체중);
        System.out.println("정상: " + 정상);
        System.out.println("과체중: " + 과체중);
        System.out.println("비만: " + 비만);

//        급여 계산
        int 기본급 = 2400000;
        int 근무시간 = 52 * 4;
        int 총급여 = (int)(기본급 + (근무시간-160) * (15000*1.5));
        int 세금 = (총급여/10);
        int 지급급여 = (총급여 - 세금);
        System.out.println("총급여: " + 총급여);
        System.out.println("세금: " + 세금);
        System.out.println("지급급여: " + 지급급여);



    }
}
