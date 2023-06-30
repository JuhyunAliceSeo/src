package chap_06;

public class _02_Parameter {
    //전달값이 있는 메소드
    public static void power(int num){ // num = Parameter, 메개변수
        //int number을 가지고 메소드를 행함
        int result = num * num;
        System.out.println(num + "의 2승은 " + result);
    }

    public static void powerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + " 의 " + exponent + " 승은 " + result);
    }
    public static void main(String[] args) {
        //전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        //Argument, 인수 = 3
        power(3); // 3 * 3 = 9
        power(4);
        powerByExp(2,3); //2 * 2 * 2 = 8
        powerByExp(3,3);
        powerByExp(10,0);


    }
}
