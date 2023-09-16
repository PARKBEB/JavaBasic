package chap_08.detector;

import chap_08.detector.Detectable;

public class FireDetector implements Detectable {

    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재를 감지합니다.");
    }
}
