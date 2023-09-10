package chap_06;

public class _Quiz_06 {
    // 개인정보를 비공개로 전환하는 메소드 작성
    // 하나의 메소드에서 모든 동작 처리
    // 각 정보는 아래 위치부터 비공개 적용
    // 이름 : 2번째 글자
    // 주민등록번호 : 9번째 글자
    // 전화번호 : 10번째 글자

    // 내 코드
    public static String Information(String name, String number, String phoneNum) {
        name = name.substring(0, 1) + "**";
        number = number.substring(0, 8) + "******";
        phoneNum = phoneNum.substring(0, 9) + "****";

        return "이름 : " + name  + "\n주민번호 : " + number + "\n휴대전화 : " + phoneNum;
    }
    
    // 강사님 코드
    public static String getHiddenDate(String data, int index) {
        String hiddenData = data.substring(0, index);
        // for (int i = index; i < data.length(); i++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
    // 내 코드
        System.out.println(Information("박은지", "961206-1234567", "010-1234-5678"));

    // 강사님 코드
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenDate(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenDate(id, 8));
        System.out.println("전화번호 : " + getHiddenDate(phone, 9));
    }
}
