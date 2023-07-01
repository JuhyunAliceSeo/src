package chap_07.camera;

public class Camera {
    public String name;

    public Camera() {
        this.name = "카메라";
    }

    public void takePicture(){
        //사진촬영
        System.out.println("사진을 촬영합니다.");
    }
    public void recordVideo(){
        //동영상 녹화
        System.out.println("동영상을 녹화합니다.");
    }
}
