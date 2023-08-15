package chap_10;

public class _02_AnonymousClass2 {

    public static void main(String[] args) {
        HomeMadeBuger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("----------------------------------------");

        HomeMadeBuger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBuger getBroMadeBurger() {
        return new HomeMadeBuger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }

    public static HomeMadeBuger getMomMadeBurger(){
        return new HomeMadeBuger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }
}

abstract class HomeMadeBuger{
    public abstract void cook();
}
