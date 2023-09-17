package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("강백호");
        list.add("서태웅");
        list.add("채치수");
        list.add("정대만");
        list.add("송태섭");

        System.out.println("--------------------------");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 추가
        list.addFirst("정우성");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        list.addLast("채소연");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        list.add(1, "이한나");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        // 삭제
        list.remove(list.size() - 1);
        System.out.println(list.size()); // 7

        System.out.println("--------------------------");

        // 처음 선수와 마지막 선수 제외
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size()); // 5

        System.out.println("--------------------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        // 변경
        list.set(0, "채소연");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------------");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        // 확인
        System.out.println(list.indexOf("서태웅")); // 1
        if (list.contains("서태웅")) {
            System.out.println("승리");
        } else {
            System.out.println("패배");
        }

        System.out.println("--------------------------");

        // 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println(list.size());
            System.out.println("빈 리스트");
        }
    }
}
