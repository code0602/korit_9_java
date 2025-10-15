package com.korit.study.ch10;

public class ClassC {
    String name;
    int age;
    String address;

    // 생성자 오버로딩 (동일한 생성자 이지만 1.타입이 다르거나 2. 위치가 다르거나 3. 매개변수의 자료형이 다르거나
    // 대표적으로 개인정보 입력란의 선택사항칸의 입력을 제외하고 입력하는경우 오버로딩으로 선택사항제외하고 새엇ㅇ

    ClassC() {

    }
    ClassC(String name) {
        this.name = name;
    }
    ClassC(String name , int age , String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    ClassC(String name , int age){
         this.name = name;
         this.age = age;
    }

}
//이름과 나이가 생성되도록
