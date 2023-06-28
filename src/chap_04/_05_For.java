package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 for
        //나코 매장
        System.out.println("어서오세요. 나코입니다");
        //또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        //인사법이 바뀌면
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        //매장이름이 코나로 바뀌면?
        System.out.println("환영합니다. 코나입니다.");

        System.out.println("------------반복문사용----------");

        //반복문 For문 이용
        for ( int i = 0; i < 10 ; i++){
//            System.out.println("어서오세요. 나코입니다." + i);
            System.out.println("환영합니다. 나코입니다." + i);
        }

        //짝수만 출력
        for(int i =0; i< 10; i+= 2){
            System.out.print(i);
        }
        System.out.println();
        for(int i=1; i<10 ; i+=2){
            System.out.print(i);
        }

        System.out.println();

        //거꾸로 숫자
        for (int i =5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + " 입니다.");
        }
        System.out.println("1부터 10까지 모든 수의 총합은 " + sum + " 입니다.");

    }
}
