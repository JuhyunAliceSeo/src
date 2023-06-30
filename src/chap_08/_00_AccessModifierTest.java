package chap_08;

import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish; //chap07 다른 패키지에 있는 BlackBoxRefurbish를 사용하겠다는 말
//import chap_07.* = 패키지안에 모든 클래스를 쓰겠다.

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();

        b1.modelName = "까망이"; //public
        //b1.resolution = "FHD" //접근자를 디폴트로 선언해서 같은 클래스만 접근 가능해서 여기선 에러뜸.
        // b1.pirce = 200000; //private
        // b1.color ="블랙"; //protected

        BlackBox b2;

    }
}
