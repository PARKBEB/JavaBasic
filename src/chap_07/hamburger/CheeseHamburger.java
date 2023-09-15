package chap_07.hamburger;

public class CheeseHamburger extends Hamburger {
    public CheeseHamburger() {
        super("치즈버거");
    }

    @Override
    public String cook() {
        return super.cook() + ", 치즈";
    }
}
