package chap_07;

import chap_07.hamburger.CheeseHamburger;
import chap_07.hamburger.Hamburger;
import chap_07.hamburger.ShrimpHamburger;

public class _Quiz_07 {
    public static void main(String[] args) {
        // 내 코드
        Hamburger hamburger = new Hamburger();
        CheeseHamburger cheeseHamburger = new CheeseHamburger();
        ShrimpHamburger shrimpHamburger = new ShrimpHamburger();

        System.out.println(hamburger.cook());
        System.out.println(cheeseHamburger.cook());
        System.out.println(shrimpHamburger.cook());

        System.out.println("-----------------------------------------");

        // 강사님 코드
        HamBurger1[] hamburgers = new HamBurger1[3];
        hamburgers[0] = new HamBurger1();
        hamburgers[1] = new CheeseHamBurger1();
        hamburgers[2] = new ShrimpHamBurger1();
        for (HamBurger1 ham : hamburgers) {
            ham.cook();
        }
    }
}

class HamBurger1{
    public String name;

    public HamBurger1() {
        this("햄버거");
    }

    public HamBurger1(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class CheeseHamBurger1 extends HamBurger1{
    public CheeseHamBurger1() {
        super("치즈버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpHamBurger1 extends HamBurger1{
    public ShrimpHamBurger1() {
        super("새우버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
