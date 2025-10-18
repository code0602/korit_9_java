package com.korit.study.연습장;

import java.util.Arrays;

public class 개인연습 {
    public static void main(String[] args) {
//        int[] nums =new int[] {10, 20, 30, 40, 50};
//        for ( int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
//          nums 물어보기
//        int[] nums = new int[] {5, 10, 15, 20, 25};
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//             sum = nums[i] + sum;
//        }
//            System.out.println("배열 요소들의 합: "+ sum);}


//        int[] nums = new int[] {23, 45, 12, 67, 34, 89, 11};
//        int max = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//
//        }
//        System.out.println("최대값은 : " + max);
        int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] even = new int[0];
        for (int i = 0; i < num.length; i++) {
            int[] temp = new int[even.length + 1 ];
            for (int j = 0; j < even.length; j++) {
                even[j] = temp[j];
            }
            even = temp;
            even[even.length -1] = num[i];
            System.out.print(" ");
        }
        System.out.print("짝수:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(" " + num[i]);
            }

        }
        }







    }
}

