//package com.korit.study.ch02;
//
//public class 연습문제 {
//    public static void main(String[] args) {
//        int baseSalary = 4000000;    // 기본급
//        int workYears = 12;          // 근무년수
//        String yearAIIlowance = workYears < 3 ? "0원 (0%)" : workYears > 3 && workYears < 7 ? "200,000원 (5%)" : workYears > 7 && workYears < 15 ? "400,000원 (10%)" : workYears > 15 ? "800,000원 (20%)" : "" ;
//        int position = 3 ;// 직급코드 (1:사원, 2:대리, 3:과장, 4:부장)
//        String positionName = position == 1 ? "사원" : position == 2 ? "대리" : position == 3 ? "과장" : position == 4 ? "부장" : "";
//        String positionAIIowance = position == 1 ? "0원" : position == 2 ? "500,000원" : position == 3 ? "1,000,000원" : position == 4 ? "2,000,000원" : "";
//        int overtimeHours = 15;      // 야근시간
//        String overtimeHours =
////        int positionAIIowance = position = 1 ?
//
//        System.out.println("=== 급여명세서 ===");
//        System.out.println("기본급 : " + baseSalary);
//        System.out.println("직급수당 : " + positionAIIowance );
//        System.out.println("연차수당 : "+ yearAIIlowance );
//        System.out.println("직급 : "+ positionName );
//
//// 테스트 케이스 2 (추가로 테스트해볼 값들)
//// int baseSalary = 3500000, workYears = 18, position = 4, overtimeHours = 8;
//// int baseSalary = 2800000, workYears = 5, position = 2, overtimeHours = 25;
//
//    }
//}
