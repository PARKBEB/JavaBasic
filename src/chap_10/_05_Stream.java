package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성
        // 스트림은 한 번 사용 후 다시 사용할 수 없음, 매번 새롭게 만들어야함

        // Array.stream
        int[] scores = {100, 95, 90, 85, 80};
        // Ctrl + A/T + V
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfSteam = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("------------------------------------");

        // 90 점 이상인 사람 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("------------------------------------");

        // 90 점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("------------------------------------");

        // 90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("------------------------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c 로 시작하는 프로그램 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("------------------------------------");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("------------------------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("------------------------------------");

        // 4글자 이하 중에서 c 라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자가 하나라도 있는지 여부
        boolean anyMath = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMath);
        System.out.println("------------------------------------");

        // 3글자 이하의 언어들은 모두 c라는 글자를 포함하는지
        boolean allMath = langList.stream()
                .filter(x -> x.length() <= 3)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMath);
        System.out.println("------------------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map
        langList.stream().filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase) // 대문자 변환
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)      // 대문자 변환
                .collect(Collectors.toList()); // Ctrl + A/T + V
        System.out.println("------------------------------------");

        langListStartsWithC.stream().forEach(System.out::println);
    }
}
