package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환 Type Casting
        //정수형에서 실수형으로
        //실수형에서 정수형으로

        //int score = 93 + 98.8 //98.8이 더블이라서 int에 불가능

        //int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score); //93.0
        System.out.println((double)score); //93.0

        //float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;

        System.out.println((int) score_f); //93
        System.out.println((int) score_d); //98

        //정수 + 실수 연산
        score = 93+(int)98.8; //93 + 98
        System.out.println(score); //191

        score_d = (double)93 + 98.8; //실수로 들어갈떄 int는 자동으로 double로 들어감
        System.out.println(score_d); //191.8

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 -> 191.0
        //int -> long -> float -> double ( 자동형변환 )

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        //double -> float -> long -> int (수동형변환)

        //숫자를 문자열로
        String s1 = String.valueOf(93); //93을 문자열 93으로 변형
        s1 = Integer.toString(93); //93 //문자열을 int
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        //문자열을 숫자로

        int i = Integer.parseInt("93");
        System.out.println(i); //93 //문자열이 숫자 93으로
        double d = Double.parseDouble("98.8");
        System.out.println(d);

    }
}
