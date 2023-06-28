package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 15; //오전 10시
        //if(조건){ 수행할 명령 }

//        if(hour < 14)
//            System.out.println("아이스 아메리카노 +1");
        //한줄일떄는 {}안해도됨


        if(hour < 14){
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
            System.out.println("커피 주문 완료 #1"); //14미만이라도 나옴.

        // 오후 2시 이전이면서 모닝커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; //모닝커피
        //if(hour < 14 && morningCoffee == false) !morningCoffee 논리연산부정
        if(hour < 14 && !morningCoffee){ //시간이 14시 이전이고(and) 모닝커피를 안마셨을때
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");

        //오후 2시 이후이거나 모닝커피를 마신경우?
        hour = 15;
        morningCoffee = true;

        // if(hour >= 14 || morningCoffee) {
        if(hour >= 14 || morningCoffee == true) {
            System.out.println("디카페인 아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
