package chap_12;

import chap_12.clean.CleanTread;

public class _01_Tread {
    public static void main(String[] args) {
        // 하나의 프로세스 (Process)
        // 쓰레드 (Thead)

        // 1 3 5 7 9
        // 2 4 6 8 10
        // cleanBySelf();

        CleanTread cleanTread = new CleanTread();
        // cleanTread.run(); // 직원 청소
        cleanTread.start(); // 동시에 청소

        cleanByBoss(); // 사장 청소
    }

    public static void cleanBySelf() {
        System.out.println("--혼자 청소 시작--");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자)" + i + "번방 청소 중");
        }
        System.out.println("--혼자 청소 끝--");
    }

    public static void cleanByBoss() {
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장)" + i + "번방 청소 중");
        }
        System.out.println("--사장 청소 끝--");
    }
}
