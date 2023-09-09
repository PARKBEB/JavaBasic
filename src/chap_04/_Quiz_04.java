package chap_04;

import java.util.Scanner;

// 주차요금은 시간당 4000원 (일일 최대 요금은 30,000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차 시 20,000원
// 경차 5시간 주차 시 10,000원
// 장애인 차량 10시간 주차 시 15,000원

public class _Quiz_04 {
    public static void main(String[] args) {
    // 내 코드
        System.out.println("[주차 요금 정산 프로그램]");

        System.out.println("주차 시간을 입력해주세요.");
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.close();

        int parking = a;

        if (parking * 4000 < 30000) {
            System.out.println("주차요금은 " + parking * 4000 +"원 입니다.");
            System.out.println("경차 또는 장애인 주차요금은 " + parking * 2000 +"원 입니다.");
        } else {
            System.out.println("주차요금은 30,000원 입니다.");
            System.out.println("경차 또는 장애인 주차요금은 15,000원 입니다.");
        }

        System.out.println("#1");

    // 강사님 코드
        int hour = 5;
        boolean isSmallCar = false;
        boolean withDisabledPerson = false;

        int fee = hour * 4000;

        if (fee > 30000){
            fee = 30000;
        }

        if(isSmallCar || withDisabledPerson){
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "원입니다.");
    }
}
