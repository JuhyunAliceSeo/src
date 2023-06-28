package chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29 //특정글자수 이상 입력하시오를 사용할때 좋음.
        
        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함관계
        System.out.println(s.contains("Java"));//문장이 길때 특정문구를 확인할때
        //포함된다면 true / 포함되지 않는다면 false
        System.out.println(s.contains("C#")); //FALSE
        System.out.println(s.indexOf("Java")); //Java(처음)의 위치정보 //7
        System.out.println(s.indexOf("C#")); //포함되어있지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보(12)
        System.out.println(s.lastIndexOf("and")); //마지막에 있는 and 위치정보 (23)
        System.out.println(s.startsWith("I like")); //이문자열로 시작하면 true(아니면 false)
        System.out.println(s.endsWith("."));  //이문자열로 끝나면 true(아니면 false)
    }
}
