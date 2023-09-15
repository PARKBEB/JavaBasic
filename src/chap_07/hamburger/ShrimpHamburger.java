package chap_07.hamburger;

import chap_07.hamburger.Hamburger;

public class ShrimpHamburger extends Hamburger {
    public ShrimpHamburger() {
        super("새우버거");
    }

    @Override
    public String cook() {
        return super.cook() + ", 새우";
    }
}
