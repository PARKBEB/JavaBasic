package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        A a = new A();
        A b = new A() {
            public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
                if (i == 5) {
                    System.out.println("-- B 상품 준비 완료 --");
                }
            }
            }
        };

        Thread thread = new Thread(a);
        Thread thread1 = new Thread(b);

        thread1.start();
        thread.start();

        try {
            thread.join();  // thread가 끝날 때까지 대기
            thread1.join(); // thread1이 끝날 때까지 대기
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        A set = new A() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("세트 상품 포장" + i + "/5");
                    if (i == 5) {
                        System.out.println("== 세트 상품 포장 완료 ==");
                    }
                }
            }
        };

        Thread thread2 = new Thread(set);
        thread2.start();
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
