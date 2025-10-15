package com.korit.study.연습장;

public class 배열연습3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 1, 3, 3};
        int[] arr1 = new int[0];
        int[] arr2 = new int[0];
        int[] arr3 = new int[0];
        //이부분 이해하고 넘어가기

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int[] temp = new int[arr1.length + 1];
                for (int j = 0; j < arr1.length; j++) {
                    temp[j] = arr1[j];
                }
                temp[temp.length -1] = nums[i];
                arr1 = temp;


            } else if (nums[i] == 2) {
                int[] temp = new int[arr2.length + 1];
                for (int j = 0; j < arr2.length; j++) {
                    arr2[arr2.length -1] = nums[i];
                    temp[j] = arr2[j];
                }
            }else if (nums[i] == 3) {
                int[] temp = new int[arr3.length + 1];
                for (int j = 0; j < arr3.length; j++) {
                    arr3[arr3.length - 1] = nums[i];
                    temp[j] = arr3[j];
                }
            }

        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }


    }
}
