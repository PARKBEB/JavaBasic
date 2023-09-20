package chap_10;

import chap_10.converter.*;

import java.sql.SQLOutput;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();

       // convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"), 1);
       Convertible convertible = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원");
       convertUSD(convertible, 2);

       // 전달값이 하나도 없는 경우
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러는 = 1400원");
        c1.convert();

        // 두 줄 이상의 코드가 있는 경우
            c1 = () -> {
              int USD = 5;
              int KRW = 1400;
                System.out.println(USD + "달러 = " + (KRW * 1400) + "원");
            };
            c1.convert();

        // 전달값이 2개인 경우
        ConvertibleWithTwoParams c2 = (D, W) -> System.out.println(D + "달러 = " + (D * W) + "원");
        c2.convert(12, 1400);

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (D, W) -> D * W ;
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + "원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
