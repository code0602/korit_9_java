package com.korit.study.ch13;

public class MapperPatternMain {
    public static void main(String[] args) {

        // MapperPatternMain

        클라이언에서받은객체 a = new 클라이언에서받은객체();
        a.username = "test1234";
        a.password = "1e2eee3e4";
        a.fullName = "LeeKeun";
        a.email = "jajannd@naver.com";

        데이터베이스에보낼객체 b = new 데이터베이스에보낼객체();
        b.username = a.username;
        b.password = a.password;
        b.name = a.fullName;
        b.email = a.email;

        데이터베이스에보낼객체 c = a.to();



    }
}
