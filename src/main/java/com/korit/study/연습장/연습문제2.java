//package com.korit.study.연습장;
//
//public class 연습문제2 {
//    public static void main(String[] args) {
//        int level = 75;
//        int jobCode = 1;
//        String jobName = jobCode == 1 ? "전사" :
//                         jobCode == 2 ? "마법사" :
//                         jobCode == 3 ? "궁수" :
//                         jobCode == 4 ? "도적" : "오류";
//        int equipGrade = 4;
//        int skillPoints = 95;
//        double jobMultiplier = jobCode == 1 ? 1.5 :
//                                jobCode == 2 ? 1.2 :
//                                 jobCode == 3 ? 1.3 :
//                                jobCode == 4 ? 1.1 : -1;
//
//        int baseStats = (int) (level * jobMultiplier);
//
//        double equipBonus = equipGrade == 1 ? 0 :
//                            equipGrade == 2 ? 10 :
//                            equipGrade == 3 ? 25 :
//                            equipGrade == 4 ? 50 :
//                            equipGrade == 5 ? 100 : -1;
////스킬 보너스: 스킬포인트 10당 5% 추가 (최대 50%)
//        int bonusStep = skillPoints / 10 ;
//        double skillStep = bonusStep * 0.5 ;
//            double skillBonus = skillPoints + skillStep ? ;
//
//
//
//
//    }
//}
