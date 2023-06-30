package chap_06;

public class _04_ParameterAndReturn {
//    public static void power(int num){ // num = Parameter, 메개변수
//        //int number을 가지고 메소드를 행함
//        int result = num * num;
//        System.out.println(num + "의 2승은 " + result);
//    }

    public static int getPower(int number){
        int result = number * number;
        return result;
        // return number * number도 됨.
    }
//
//    public static void powerByExp(int num, int exponent){
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= num;
//        }
//        System.out.println(num + " 의 " + exponent + " 승은 " + result);
//    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int retVal = getPower(2); //2 * 2 = 4
        System.out.println(retVal); //2 * 2 = 4

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3,3);
        System.out.println(retVal);
        //위아래는 근본적으로 같음.
        System.out.println(getPowerByExp(2,4)); //16
    }
}
