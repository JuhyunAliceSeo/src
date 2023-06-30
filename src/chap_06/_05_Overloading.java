package chap_06;

public class _05_Overloading {
    public static int getPower(int number) { //"4"
        int result = number * number;
        return result;
        // return number * number도 됨.
    }
    //문자열 4를 받아서 숫자로 변환후
    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        // 같은 이름의 메소드를 여러번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나

        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        //숫자형태가 더블이나 플롯, 경우에따라서 불리안이 올수 있는데 매번 만들면 혼란이 올수 있음. 그래서 오버로딩을 하는거임.
        //전달값의 타입, 자료형, 개수가 다르면 똑같은 이름의 매소드를 얼마든지 만들수 있음.

        System.out.println(getPower(3,3));

    }
}
