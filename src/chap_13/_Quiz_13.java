package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        // 강사님 퀴즈 코드 재청강 필요 10/01

        Scanner scr = new Scanner(System.in);
        File file = new File("quiz.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("(문제) 세 살 __ 여든까지 간다");
            bw.newLine();
            bw.write("(문제) 소 읽고 ___ 고친다");
            bw.newLine();
            bw.write("(문제) 천 리 길도 한 __부터");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int questionNumber = 1;

            while ((line = br.readLine()) != null) {
                System.out.println("퀴즈" + questionNumber + ": " + line);
                System.out.println("정답 입력 => ");
                String userAnswer = scr.next();

                if (questionNumber == 1 && userAnswer.equals("버릇")) {
                    System.out.println("정답입니다!!!");
                } else if (questionNumber == 2 && userAnswer.equals("외양간")) {
                    System.out.println("정답입니다!!!");
                } else if (questionNumber == 2 && userAnswer.equals("걸음")) {
                    System.out.println("정답입니다!!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + getCorrectAnswer(questionNumber) + " 입니다.");
                }

                questionNumber++;
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getCorrectAnswer(int i) {
        switch (i) {
            case 1:
                return "버릇";
            case 2:
                return "외양간";
            case 3:
                return "걸음";
            default:
                return "";
        }
    }
}
