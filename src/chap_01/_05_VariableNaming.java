package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 밑줄 또는 문자로 시작 가능
        // 2. 소문자로 시작, 각 단어의 사작 글자는 대문자
        // 3. 예약어 사용 불가 (public, static, void, int, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "은지"; // 이름
        String lastName = "박"; // 성
        String dateOfBirth = "1996-12-06"; // 생년월일
        String residentialAddress = "하야트 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
