package chap_07.camera;

public class FactoryCam {
    public String name;

    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void takePicture(){
        //사진촬영
        System.out.println("사진을 촬영합니다.");
    }
    public void recordVideo(){
        //동영상촬영
        System.out.println("동영상을 녹화합니다.");
    }
    public void detectFire(){
        //화재감지
        System.out.println("화재를 감지합니다.");
    }
}
