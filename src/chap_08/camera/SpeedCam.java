package chap_08.camera;

import chap_08.detector.AccidentDetector;
import chap_08.reporter.VideoReporter;

public class SpeedCam extends Camera {

    public AccidentDetector accidentDetector;
    public VideoReporter videoReporter;
    @Override
    public void showMainFeature() {
       System.out.println("속도 측정, 번호 인식");
    }

    public void setDetector(AccidentDetector accidentDetector) {
        this.accidentDetector = accidentDetector;
        accidentDetector.detect();
    }

    public void setReporter(VideoReporter videoReporter) {
        this.videoReporter = videoReporter;
        videoReporter.report();
    }
    public void detect() {
        System.out.println("사고를 감지합니다.");
    }

    public void report() {
        System.out.println("사고 신고를 진행합니다.");
    }
}
