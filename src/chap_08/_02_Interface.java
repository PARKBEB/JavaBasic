package chap_08;

import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // Reportable normalReporter = new NomalReporter()'
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        // VideoReporter videoReporter = new VideoReporter()'
        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        Detectable advancedFireDetector = new AdvancedFireDetector();


    }
}