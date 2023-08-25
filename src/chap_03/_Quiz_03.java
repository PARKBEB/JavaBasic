package chap_03;

import java.util.Scanner;

public class _Quiz_03 {
    public static void main(String[] args) {
        System.out.println("주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오");
        Scanner src = new Scanner(System.in);
        System.out.println("주민등록번호 13자리를 입력하세요.");
        String s = src.nextLine();
        src.close();

        int i = 0;
        int j = 8;

        System.out.println(s.substring(i, j) + "*******");


    }
}
