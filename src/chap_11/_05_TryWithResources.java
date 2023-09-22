package chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {

    }
}

class MyFileWriter implements AutoCloseable {

    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }
}