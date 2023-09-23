package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writerFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요.");
        }

    }
    public static void writerFile() throws IOException { // 이 메소드를 호출한 곳으로 예외처리를 미루기 위해 throws 사용
//        try {
//            FileWriter writer = new FileWriter("text.txt");
//            throw new IOException("파일 쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요;");
//        }

        FileWriter writer = new FileWriter("text.txt");
        throw new IOException("파일 쓰기에 실패했어요!!");
    }
}
