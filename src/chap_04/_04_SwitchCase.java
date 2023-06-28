package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case(명확한 케이스가 있는 경우가 있는경우)
        //1 등 : 전액 장학금
        //2 등 : 반액 장학금
        //3 등 : 반액 장학금
        //그 외 : 장학금 대상 아님

        //If Else문을 이용
        int ranking = 4; //1등
        if(ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking==2) {
            System.out.println("반액 장학금");
        } else if (ranking==3){
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");
        
        //Switch Case문
//        switch (expression){
//            case A: ..수행할 명령..
//                    break;
//            case B:
//            case C:
//                ...
//            default:
//        }
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금"); //중복이 있어서 밑줄이 생김
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 2와 3을 통합
        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금"); //중복이 있어서 밑줄이 생김
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정(1급 : 최상, 4급: 최하)
        int grade = 1; //등급
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000; //price = price + 1000
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격" + price + "원");
        //1등급 제품의 가격 : 10000원
        //2등급 제품의 가격 : 9000원
        //3등급 제품의 가격 : 8000원

        int score = 95;
        if(score >= 90)
            System.out.println("A");
        else if (score >= 80) {
            System.out.println("B");
        }//값이 명확하면 스위치문 명확하지 않으면 if문


    }
}
