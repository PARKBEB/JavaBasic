package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("강백호");
        list.add("(알 수 없음)");
        list.add("서태웅");
        list.add("(알 수 없음)");
        list.add("송태섭");
        list.add("(알 수 없음)");
        list.add("정대만");
        list.add("(알 수 없음)");
        list.add("채치수");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------");

        // 단축키 : Ctrl + alt + v
        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println("------------------------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // hasNext 다음에 가져올 데이터가 있는지 확인
            System.out.println(it.next());
        }
        System.out.println("------------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------------------");

        HashSet<String> set = new HashSet<>();
        set.add("강백호");
        set.add("서태웅");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("강백호", 10);
        map.put("서태웅", 10);

        // map.iterator() 제공되지않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("------------------------");
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("------------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
