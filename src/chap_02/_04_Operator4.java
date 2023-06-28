package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리연산자
        boolean kimchi = true;
        boolean egg = true;
        boolean pork = true;

        System.out.println(kimchi || egg || pork); // 하나라도 true이면 true -> true ||=or
        System.out.println(kimchi && egg && pork); // 모두 true이면 true -> true

        //and 연산
        System.out.println((5 > 3) && (3 > 1)); //5는 3보다 크고, 3은 1보다 크다(true)
        System.out.println((5 > 3) && (3 < 1)); //5는 3보다 크고, 3은 1보다 작다(false)

        //or연산
        System.out.println((5 > 3) || (3 > 1)); //5는 3보다 크거나, 3은 1보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); //5는 3보다 크거나, 3은 1보다 작다(true) 하나라도 맞았으니 true
        System.out.println((5 < 3) || (3 < 1)); //5는 3보다 작거나, 3은 1보다 작다(false)

        // 3개를 동시에 비교 불가능 - > System.out.println(1 < 3 < 5);

        // 논리 부정연산자
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true



    }
}
