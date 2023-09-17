package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("강백호");
        list.add("서태웅");
        list.add("채치수");
        list.add("정대만");
        list.add("송태섭");

        // 데이터 조회 (인덱스 순)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------------------------");

        // 삭제
        System.out.println("출전 선수 수 : " + list.size() + "명");
        list.remove("정대만");;
        System.out.println("최종 출전 선수 수 : " + list.size() + "명");
        System.out.println(list.get(3));

        System.out.println("--------------------------");

        System.out.println("남은 선수 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1); // index : 3
        System.out.println("남은 선수 수 (제외 후) : " + list.size()); // 3

        System.out.println("--------------------------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        // 변경 (수강권 양도)
        list.set(0, "정우성");
        System.out.println(list.get(0));

        System.out.println("--------------------------");

        // 확인
        System.out.println(list.indexOf("서태웅")); // 1

        System.out.println("--------------------------");

        // 선착순 5명 내에 포함 여부
        if(list.contains("채치수")) {
            System.out.println("포함");
        } else {
            System.out.println("미포함");
        }

        System.out.println("--------------------------");

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("선수 수 : " + list.size());
            System.out.println("빈 리스트");
        }

        System.out.println("--------------------------");

        // 새로 영입된 선수
        list.add("강백호");
        list.add("서태웅");
        list.add("채치수");
        list.add("정대만");
        list.add("송태섭");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
