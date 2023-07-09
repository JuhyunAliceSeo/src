package chap_07.camera;

public class Camera { //부모클래스(
    public String name;

    public Camera() {
        this("카메라");
    }

    protected Camera(String name){
        this.name= name;
    }

    public void takePicture(){
        //사진촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }
    public void recordVideo(){
        //동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능: 사진촬영, 동영상녹화");
    }
}
