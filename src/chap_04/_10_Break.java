package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        //Break
        //치킨집에서 매일 20마리만 판매(1인상 1마리만 구매 가능)

        //For문

        int max = 20;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if(i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("-----------------");
        //While문

        max = 20;
        int index = 1; //손님 대기번호
        while(index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            index++;
            if(index==max){
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }

            }
        System.out.println("영업을 종료합니다.");
    }
}
