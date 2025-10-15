package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("고객아이디를 입력하세요: ");
        String userId = scanner.nextLine();
        System.out.print("상품 코드를 입력하세요: ");
        String productCode = scanner.nextLine();
        System.out.print("상품명을 입력하세요: ");
        String productName = scanner.nextLine();
        System.out.print("수량을 입력하세요: ");
        int number = scanner.nextInt();
        System.out.print("단가를 입력하세요: ");
        int price = scanner.nextInt();
        System.out.print("우편번호를 입력하세요: ");
        int postalcode = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("배송주소를 입력하세요: ");
//        String address = scanner.nextLine();
//        int totalprice = number * price;
//        int deliverycharge = 3000;
////        int delivery = totalprice > 30000 ? "무료" : "3000";
//
//        System.out.print(String.format("""
//                고객 ID: %s
//                상품 정보:
//                  - 상품코드: %s
//                  - 상품명: %s
//                  - 단가: %,d원 × %,d원 = %,d원
//                배송 정보:
//                  - 우편번호: %d
//                  - 주소: %s
//                  - 배송비: %d원 (3만원 이상 구매)
//                총 결제 금액: %d원""", userId, productCode, productName, price, number, totalprice, postalcode, address, totalprice));





    }
}
