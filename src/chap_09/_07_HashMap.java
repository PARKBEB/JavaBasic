package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("강백호", 10);
        map.put("서태웅", 9);
        map.put("채치수", 5);
        map.put("정대만", 5);

        System.out.println("총 선수 수 : " + map.size());
        System.out.println("------------------------");

        // 조회
        System.out.println("강백호 선수의 득점 : " + map.get("강백호"));
        System.out.println("서태웅 선수의 득점 : " + map.get("서태웅"));
        System.out.println("------------------------");

        // 확인
        if (map.containsKey("정대만")) {
            int point = map.get("정대만");
            map.put("정대만", ++point);
            System.out.println("정대만 선수 누적 포인트 : " + map.get("정대만"));
        } else {
            map.put("정대만", 1);
            System.out.println("정대만님 첫 득점 (포인트 1)");
        }
        System.out.println("------------------------");

        // 삭제
        map.remove("채치수");
        System.out.println(map.get("채치수")); // null
        System.out.println("------------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 선수 수 : " + map.size());
        }
        System.out.println("------------------------");

        map.put("강백호", 10);
        map.put("서태웅", 9);
        map.put("채치수", 5);
        map.put("정대만", 5);

        // Key 확인
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("------------------------");

        // Value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println("------------------------");

        // Key/Value 함께 확인
        for (String key : map.keySet()) {
            System.out.println("선수 이름 : " + key + "\t\t포인트 : " + map.get(key));
        }
        System.out.println("------------------------");

        // 맵 : 중복 X, 순서 X
        map.put("채소연", 10);
        map.put("채소연", 20);
        map.put("채소연", 30);

        for (String key : map.keySet()) {
            System.out.println("선수 이름 : " + key + "\t\t포인트 : " + map.get(key));
        }
        System.out.println("------------------------");
    }
}
