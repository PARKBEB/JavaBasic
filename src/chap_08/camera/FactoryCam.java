package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    public Detectable detector; // 인터페이스 변수
    public Reportable reportor;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReportor(Reportable reportor) {
        this.reportor = reportor;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {

    }

    @Override
    public void report() {

    }
}
