package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 달걀말이 = true;
        boolean 제육볶음 = true;

        // 아래 3개 중 한 개이상 참일 경우, true
        System.out.println(김치찌개 | 달걀말이 | 제육볶음);
        System.out.println(김치찌개 && 달걀말이 && 제육볶음);

        // And 연산
        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));

        // Or 연산
        System.out.println((5 < 3) || (3 > 1));
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1));

        System.out.println((5 < 3) || (3 < 1));

        // System.out.println(1 < 3 < 5); // 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5));
        System.out.println(!(5 == 3));
    }
}
