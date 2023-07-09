package chap_07.camera;

public class ActionCam extends Camera{
    public final String lens; // = "광각렌즈";

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; //이런방법으로도 선언할수 있음.
    }

    public void makeVideo(){
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
