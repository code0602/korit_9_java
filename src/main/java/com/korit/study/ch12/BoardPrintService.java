package com.korit.study.ch12;

import java.sql.JDBCType;
import java.sql.SQLOutput;
import java.util.WeakHashMap;

public class BoardPrintService {

    void PrintAll(Board[] boards) {
        System.out.println("게시글 정보 전체 출력");
        for (Board board : boards) {
            System.out.println("게시글 번호: " + board.id);
            System.out.println("게시글 제목: " + board.title);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);
            System.out.println("게시글 작성자 이름: " + board.writer.name);
            for (Comment comment : board.comments) {
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.contents);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.name);

            }
            System.out.println("게시글 작성자 ID: " + board.writer.id);


        }
    }
}


