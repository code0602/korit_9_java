package com.korit.study.ch08;

public class Array03 {
    public static void main(String[] args) {
        int[] nums = {15, 23, 7, 30, 4, 18};
        int 탐색횟수 = 0;
        int 찾은인덱스 = 30;


        for (int i = 0; i <nums.length ; i++) {
            탐색횟수++;
            if(nums[i] == 30) {
                찾은인덱스 =i;
                break;
            }
        }
        System.out.println();

    }
}
