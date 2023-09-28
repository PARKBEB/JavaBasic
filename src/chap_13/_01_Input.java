package chap_13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner scr = new Scanner(System.in);
//        System.out.println("이름을 입력 하세요.");
//        String name = scr.next();
//        System.out.println("혈액형을 입력 하세요.");
//        String bloodType = scr.next();
//        System.out.println("키를 입력 하세요.");
//        // int height = Integer.parseInt(scr.next());
//        int height = scr.nextInt();
//        System.out.println("몸무게를 입력 하세요.");
//        // double weight = Double.parseDouble(scr.next());
//        double weight = scr.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름: " + name);
//        System.out.println("혈액형: " + bloodType + "형");
//        System.out.println("키: " + height + "cm");
//        System.out.println("몸무게: " + weight + "kg");

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        // scr.next() < 띄어쓰기로 구분해서 값을 처리한다
        String lang = scr.next(); // 한 단어 (자바 파이썬)
        // scr.nextLine() < 한 문장으로 구분해서 값을 처리한다
        // String lang = scr.nextLine();
        System.out.println("언어 : " + lang);

        scr.nextLine(); // 불필요한 문장을 삭제

        System.out.println("배우고 나니 기분이 어땠나요?");
        // String feeling = scr.next(); // 한 문장 (재밌었어요)
        String feeling = scr.nextLine();
        System.out.println("기분 : " + feeling);
    }
}
