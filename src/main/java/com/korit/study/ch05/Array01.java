package com.korit.study.ch05;

public class Array01 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        int[] nums = {1, 2, 3};
        int[] num2 = new int[]{1, 2, 3};

        int[] nums3 = new int[3];
        nums3[0] = 1;
        nums3[1] = 2;
        nums3[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }


        for (int i = 0; i < 3; i++) {
        }

        String[] names = { "김준일" ,"김준이","김준삼" };
        for (int i = 0; i < 3; i++) {
            System.out.println("이름: " + names[i]);
        }
//        forEach
        for (int i : new int[] {1,2,3,4,}) {
            System.out.println(i);
        }
    }
}

