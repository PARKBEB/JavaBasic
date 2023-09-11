package chap_07;

public class BlackBox {
    // 인스턴스 변수
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    // 클래스 변수 - 모든 객체에 똑같이 적용됨
    static boolean canAutoReport = false; // 자동 신고 기능

    // 자동 신고 기능 메소드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        } else {
            return 10;
        }
    }

    void record (boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true,true,5);
    }

    // 모든 객체에 공통으로 사용되는 메소드
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
        canAutoReport = false;
    }

    // static으로 선언한 Class 변수는 static 메소드에서 바로 사용 가능
    // 하지만 modelName과 같은 인스턴스 변수는 객체가 만들어져야 사용 가능
}
