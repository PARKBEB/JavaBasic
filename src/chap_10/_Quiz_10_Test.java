package chap_10;

import java.util.Scanner;

public class _Quiz_10_Test {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("성인 몇 분입니까?");
        int i = src.nextInt();
        Customer.ticket(i);

    }
}

class Customer {
    public int adult;
    public static int ticket;
    public static void ticket(int adult) {
        if (1 <= adult) {
            ticket = 5000 * adult;
            System.out.println("입장료는 " + ticket + "입니다.");
        } else {
            System.out.println("입장료는 " + ticket + "입니다.");
        }
    }
}
