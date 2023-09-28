package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        A a = new A();
        Thread thread = new Thread(a);

        thread.start();
        B();
    }
    public static void B() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B 상품 준비 " + i + "/5");
            if(i == 5) {
                System.out.println("-- B 상품 준비 완료 --");
            }
        }
    }
}

class A implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("A 상품 준비 " + i + "/5");
            if(i == 5) {
                System.out.println("-- A 상품 준비 완료 --");
            }
        }
    }
}
