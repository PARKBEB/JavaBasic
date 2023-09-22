package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class _Quiz_10 {
    public static void main(String[] args) {
        ArrayList<Customers> customers = new ArrayList<>();
        customers.add(new Customers("챈들러", 50));
        customers.add(new Customers("레이첼", 42));
        customers.add(new Customers("모니카", 21));
        customers.add(new Customers("벤자민", 18));
        customers.add(new Customers("제임스", 5));

        Stream<Customers> CuStream = customers.stream();
        CuStream.map(x -> x.age > 20 ? x.name + "\t5000원" : x.name + "\t무료")
                .forEach(System.out::println);



    }
}

class Customers {
    public String name;
    public int age;

    public Customers(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
