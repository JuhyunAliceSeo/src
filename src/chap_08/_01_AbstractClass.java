package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화(Data Abstraction)
        //abstract -> 추상클래스(아직 완성되지 않은 클래스)를 만들수 있슴.
        //추상 메소드(추상클래스 또는 인터페이스에서 사용 가능한 컵데기만 있는 메소드)

        // Camera camera = new Camera() ->abstract(추상클래스)이기 때문에 만들지 못함

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }
}
