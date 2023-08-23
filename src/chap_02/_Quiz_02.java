package chap_02;

import java.util.Scanner;

public class _Quiz_02 {
    public static void main(String[] args) {
        System.out.println("[놀이공원 탑승키 기준]");

        System.out.println("탑승객의 키를 입력해주세요.");
        Scanner src= new Scanner(System.in);
        int a = src.nextInt();
        // 입력 사용이 끝났으니 Scanner 닫음
        src.close();

        String s = (a < 120) ? "탑승 불가능합니다." : "탑승 가능합니다.";
        System.out.println("키가 " + a + "cm이므로 " + s);
    }
}
