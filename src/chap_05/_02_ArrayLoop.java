package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회

        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        
        for ( int i = 0; i < 4; i++){
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("----------------------");

        //배열의 길이를 이용한 순회
        for(int i = 0; i < coffees.length ; i++){ //coffees.length = coffees의 배열
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("----------------------");

        // enhanced for(for-each) 반복문 = 모든요소를 반복할때
        for(String coffee : coffees) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");
        //for(같은문자열형태 이름 : 배열이름){} = 순서로 순열되는것을 이름을 커피라고 하겠다
    }
}
