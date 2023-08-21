package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "에도가와 코난";
        int hour = 15;
        System.out.println(name + "님, 배송이 시작되었습니다. " + hour + "시 방문 예정입니다.");
        System.out.println(name + "님,배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "브라운 박사";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다." );

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        /*
        실수를 적으면 자동으로 double로 인식됨
        float 보다는 double이 정확함
        float은 소수점 6자리까지는 정확도가 높으므로 6자리 이하일 경우, float 사용
         */
        double d = 3.123456789;
        float f = 3.123456789F;
        System.out.println(d);
        System.out.println(f);

        /*
        정수를 적으면 자동으로 int로 인식됨
        하지만 int로 변수 생성할 수 있는 범위는 -21억 ~ 21억
        그 이상의 범위일 경우, long 사용함
        */
        long l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
