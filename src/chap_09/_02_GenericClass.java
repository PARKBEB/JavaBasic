package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("은쨩");
        c2.ready();

        System.out.println("-----------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("엔젤릭은쨩");
        c4.ready();

        System.out.println("-----------------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("-----------------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("텐텐은쨩");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-----------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("팬텀은쨩"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("캡틴은쨩"));
        c8.ready();

        System.out.println("-----------------------------");

        orderCoffee("아델은쨩");
        orderCoffee(36);

        System.out.println("-----------------------------");

        orderCoffee("호영은쨩", "아이스초코");
        orderCoffee(37, "고구마라때");
    }
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);

    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
