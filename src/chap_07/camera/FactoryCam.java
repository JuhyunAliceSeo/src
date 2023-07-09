package chap_07.camera;

public class FactoryCam extends Camera { //자식클래스

    public FactoryCam() {
        //this.name = "공장 카메라";
        super(); //부모클래스의 생성자에 바로 접근
    }

    public void recordVideo(){
        //동영상 녹화
        super.recordVideo();
        detectFire();
    }

//    public void takePicture(){
//        //사진촬영
//        System.out.println("사진을 촬영합니다.");
//    }
//    public void recordVideo(){
//        //동영상촬영
//        System.out.println("동영상을 녹화합니다.");
//    }
    public void detectFire(){
        //화재감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature(){//메소드 오버라이딩
        System.out.println(this.name + "의 주요기능: 화재감지");
    }
}
