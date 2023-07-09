package chap_07;

import com.sun.xml.internal.ws.api.ResourceLoader;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형(Enum)
        //달력 : JAN, FAB, MAR..
        //옷사이즈 : S, M , L, XL...
        //0S 종류 : WIN10, WIN11, MACOS, LINUX...
        //해상도 : HD, FHD, QHD, UHD..

        Resolution resolution = Resolution.HD;
        System.out.println(resolution); //HD

        resolution = Resolution.FHD;
        System.out.println(resolution); //FHD

        System.out.print("동영상 녹화 품질 : "); //고화질
        switch (resolution){
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("--------------------------");

        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("--------------------------");

        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
} //Resolution의 열거에서는 HD, FHD, UHD 상수를 가지게 된 것
