package chap_11;

import java.io.IOException;

public class _Quiz_11 {
    public static void main(String[] args) {
        Shopping.writer(0);

    }
}

class Shopping {
    public static void writer(int i)  {
        try {
            if (i == 0) {
                System.out.println("(상품 구매를 완료하였습니다)");
            } else if (i == 1) {
                throw new Exception("상품 구매 가능 시간이 아닙니다");
            } else if (i == 2){
                throw new TooLateException("해당 상품은 매진되었습니다");
            }
        } catch (TooLateException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다");
        }
    }
}

class TooLateException extends Exception {
    public TooLateException(String message) {
        super(message);
    }

}

