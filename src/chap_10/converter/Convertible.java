package chap_10.converter;

@FunctionalInterface // 이 인터페이스는 함수형 인터페이스로 사용할 것을 명시
                     // 해당 경우 인터페이스에 추상 메소드는 1개만 등록 가능
public interface Convertible {
    void convert(int USD);
}
