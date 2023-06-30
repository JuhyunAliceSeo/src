package chap_06;

public class _07_VariableScope {
    public static void methodA(){
        //System.out.println(number);//메인영역에 있는 변수는 메인영역에만 쓸수 있음
        //System.out.println(result);//메소드 b에서 만든 변수는 메소드 b에만 쓰임.
    }

    public static void methodB(){
        int result = 1; //지역 변수
    }
    public static void main(String[] args) {
        int number = 3; //메인영역에 있는 변수는 메인영역에만 쓸수 있음

        //System.out.println(result); //메소드 b에서 만든 변수는 메소드 b에만 쓰임.

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i);//for문에서 쓰이는 i는 for문에서만 쓰임
        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        //System.out.println(j);//중괄호 안에서 변수는 중괄호 안에서만 쓰임.

    }
}
