package com.korit.study.연습장;

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;
        String positionName = position == 1 ? "사원" :
                              position == 2 ? "대리" :
                              position == 3 ? "과장" :
                              position == 4 ? "부장" : "오류" ;
        int positionAllowance = position == 1 ? 0 :
                                position == 2 ? 500000 :
                                position == 3 ? 1000000 :
                                position == 4 ? 2000000 : -1;

        double yearRate = workYears < 3 ? 0.0 :
                workYears < 7 ? 0.05 :
                        workYears < 15 ? 0.1 : 0.2;
        int yearAllowance = (int)(yearRate * baseSalary);

        int overtimePayment = overtimeHours < 10 ? overtimeHours * 10000 :
                              overtimeHours > 10 ? (overtimeHours-10) * 15000 : -1;

        int specialBonus = position == 4 && workYears > 15 ? 500000 : 0 ;

        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + overtimePayment ;

        int tax = (int)(totalSalary < 5000000 ? totalSalary*0.1 :
                  totalSalary * 0.15);
        int finalSalary = totalSalary - tax;
        int yearsplus = workYears < 3 ? 0 :
                        workYears < 7 ? 5 :
                        workYears < 15 ? 10 :
                        workYears > 15 ? 20 : -1;
        int basetime = overtimeHours > 10 ? 10 : 10-overtimeHours;
        int overtime = overtimeHours > 10 ? overtimeHours-10 : 0;



        System.out.println("=== 급여 명세서 ===");
        System.out.println(String.format(
                        """       
                        기본급:%,d원
                        직급:%s
                        직급수당:%,d원
                        연차수당:%,d원 (%d%%)
                        야근수당:%,d원 (기본 시간 %d시간+ 초과 %d시간)
                        특별보너스:%,d원
                        총 지급액:%,d원
                        세금(15%%):%,d원
                        실수령액:%,d원
                        """, baseSalary, positionName, positionAllowance, yearAllowance, yearsplus, overtimePayment, basetime, overtime, specialBonus, totalSalary, tax, finalSalary));

    }
}
