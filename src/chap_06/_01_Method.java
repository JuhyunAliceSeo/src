package chap_06;

public class _01_Method {
    //메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) {
        //메소드 호출(실행시킴)
        System.out.println("메소드 호출전");
        sayHello();
        System.out.println("메소드 호출후");


    }
}
