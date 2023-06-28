package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수이름 짓는법
        // 1. 저장할 값에 어울리는 이름.
        // 2. 밑줄, 문자, 숫자 사용가능(공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능(숫자 시작 불가능)
        // 4. 한단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작글자는 대문자(첫 단어는 제외)
        // 6. 예약어는 사용 불가(public static, void, float, int,,,)

        //다른나라 입국 신고서(여행)
        String nationality = "대한민국"; //국적
        String firstName = "주현"; //이름
        String lastName = "서"; //성
        String dateOfBirth ="2022-01-01"; //생년월일
        String residentialAddress = "무슨호텔";// 체류지
        String purposeOfVisit = "여행"; //방문목적
        String flightNo = "KE123"; //항공편명
        String _flightNo = "KE123"; //밑줄시작
        String flight_no_2 = "KE123"; //밑줄과 숫자 포함

        int accompany = 2;//동반가족수
        int lengthOfStay = 5;//체류기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "시계"; 숫자시작 안됨.
        
        //프로그램의 흐름을 위해 사용되는 경우 등(크게 이름이 중요하지 않을 떄)
        int i = 0;
        String s = "";
        String str = "";
        
        //상수 = 절때 변하지 않음. -> 대문자로
        final String CODE = "KR"; //final 선언하면 상수 / 이름은 모두 대문자로
        //CODE = "US"; 상수라 안변함

    }
}
