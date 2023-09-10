package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i]);
        }
        System.out.println("---------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
        }
        System.out.println("---------------------");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees) { // coffees라는 배열에 있는 값을 순서대로 순회하는데 순회되는 값을 coffee에 담음
            System.out.println(coffee);
        }
    }
}
