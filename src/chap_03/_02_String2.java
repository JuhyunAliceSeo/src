package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        
        //문자열 변환
        System.out.println(s.replace("and",",")); //s안에 문장속에 and를 ,로 변환
        System.out.println(s.substring(7));// 인덱스 기준 7 부터 시작(이전 내용은 삭제) //변환은 안됨.
        System.out.println(s.substring(s.indexOf("Java"))); //위와 같은 내용
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
        // 끝위치 직전까지만 나오고 그 이후는 잘라냄.

        //공백제거
        s = "      I love Java.      ";
        System.out.println(s);
        System.out.println(s.trim()); //불필요한 앞 뒤 공백 제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(",".concat(s2))); //s1뒤에 "," 뒤에ㄴ s2 바로 붙임
    }
}
