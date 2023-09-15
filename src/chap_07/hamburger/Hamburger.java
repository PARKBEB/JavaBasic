package chap_07.hamburger;

public class Hamburger {
    String name;

    public Hamburger() {
        this("햄버거");
    }
    public Hamburger(String name) {
        this.name = name;
    }

    public String cook() {
        return this.name + "의 재료는 양상추, 패티, 피클";
    }
}
