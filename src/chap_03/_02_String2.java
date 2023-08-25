package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Pyton and C.";

        // 문자열 반환
        System.out.println(s.replace(" and", ",")); // " and"를 "," 로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // s.indexOf("Java") "Java" 포함, s.indexOf(".") "." 앞까지 표시
                                                                            // 결과 : Java and Pyton and C
        // 공백 제거
        s = "              I lova Java.     ";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
