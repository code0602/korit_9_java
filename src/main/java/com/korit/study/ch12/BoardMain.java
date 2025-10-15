package com.korit.study.ch12;

import javax.print.attribute.standard.PrinterInfo;

public class BoardMain {
    public static void main(String[] args) {




        Writer[] writers = new Writer[3];
        writers[0]  = new Writer(1001,"이근");
        writers[1]  = new Writer(1002,"김준일");
        writers[2]  = new Writer(1003,"문명성");

        Comment[][] comments = new Comment[2][];
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];
        comments[0][0]  = new Comment(101,"뭐하니",writers[0]);
        comments[0][1]  = new Comment(102,"배고파",writers[1]);
        comments[1][1] = new Comment(103,"공부하자",writers[2]);
        comments[1][2] = new Comment(104,"세차하자",writers[0]);

        Board[] boards = new Board[2];
        boards[0] = new Board(11, "공부할래", "세차할래?", writers[0],comments[0]);
        boards[1] = new Board(12,"골프칠래","공부할래?",writers[1],comments[1]);

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.PrintAll(boards);








        //Board배열 - boards - > 게시글 2개

        // Board  - id(정수) , title(문자열), contents(문자열), writer(Writer), comments(Comment[])

        // Writer - id(정수) , name(문자열),

        // Comment - id(정수), contents(문자열), writer(Writer
    }
}
