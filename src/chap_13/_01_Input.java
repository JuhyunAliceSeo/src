package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        //사용자 입력
        Scanner sc = new Scanner(System.in);

//        System.out.println("이름을 입력하세요");
//        String name = sc.next();//사용자로부터 String 형태로 입력받기 위해
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요");
//        //sc.next는 항상 string으로 반환하기 떄문에 정수로 변하게 해줄것이 필요함
//        // int height = Integer.parseInt(sc.next());
//        int height = sc.nextInt();//반드시 정수형 값을 입력받아야함
//        System.out.println("몸무게를 입력하세요");
//        //double height = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요");
        String lang = sc.next(); //한단어 (자바, 파이썬)
        //String lang = sc.nextLine();//한줄전체를 입력으로 받는다
        System.out.println("언어는 " + lang);

        sc.nextLine();//불필요한 문장을 삭제

        System.out.println("배우고 나니 기분이 어땠나요?");
        //String feeling = sc.next(); //재밌었어요
        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);

    }
}
