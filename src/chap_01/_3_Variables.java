package chap_01;

public class _3_Variables {
    public static void main(String[] args) {
        //변수는 데이터를 저장하는 공간

        String name;
        name = "나도코딩"; //프로그램에서 등호는 오른쪽 값을 왼쪽에 객체(변수에)에 속한다는 의미
        int hour = 15;

        System.out.println( name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println( name + "님, 배송이 완료되었습니다.");

        double score = 90.4;
        char grade = 'A';
        name = "강백호"; //여기서 부터는 이름은 강백호라고 업데이트 됨.
        System.out.println(name + "님의 평균점수는 " + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123456789;
        // float f = 3.14; 에러?  3.14(소수점을 포힘하는 실수)는 자동적으로 double자료형이라고 인식함. //
        float f = 3.14123456789F; // 에러 안뜨게 하려면 뒤에 F를 붙여야함

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l=1_000_000_000_000l;
        System.out.println(l);

        //int, long, float, double, char, String, boolean


    }
}
