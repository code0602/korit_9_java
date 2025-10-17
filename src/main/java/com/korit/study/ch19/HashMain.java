package com.korit.study.ch19;

import java.util.Objects;

public class HashMain {

    public static void main(String[] args) {

        //hash(해시)란 key ,Value의 한 쌍을 통해 데이터를 표현하는 기법
        // key : 중복 불가능 (주민등록번호)
        // value : 중복가능  (이름)
            String name1 = "김준일";
            String name2 = new String("김준일");
            int age1 = 30;
            int age2 = 40;

            int hashKey1 = Objects.hash(name1);
            int hashKey2 = Objects.hash(name2);
            int hashKey3 = Objects.hash(age1);
            int hashKey4 = Objects.hash(age2);

            System.out.println(name1);
            System.out.println(name2);
            System.out.println(age1);
            System.out.println(age2);
        }

    }

