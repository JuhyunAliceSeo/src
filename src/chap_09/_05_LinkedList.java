package chap_09;

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst()); //링크트 리스트 제일 첫번째꺼 가지고 오기
        System.out.println(list.getLast()); //링크트 리스트 제일 마지막꺼 가지고 오기
        System.out.println("---------------------------------");

        //데이터 추가
        list.addFirst("서장훈"); //가장 맨위로 추가
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("---------------------------------");
        list.addLast("김희철"); //가장 마지막에 추가
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("---------------------------------");

        System.out.println("학생 추가 전(index 1) : " + list.get(1));
        list.add(1,"김영철");
        System.out.println("학생 추가 후(index 1) : " + list.get(1));
        System.out.println("학생 추가 후(index 2) : " + list.get(2));

        System.out.println("---------------------------------");

        //삭제
        System.out.println("남은 학생수 ( 제외 전 ) : " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생수 ( 제외 후 ) : " + list.size());

        System.out.println("---------------------------------");

        //처음과 마지막 학생이 전학
        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("남은 학생수 ( 전학 전 ) : " + list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 학생수 ( 전학 후 ) : " + list.size());
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("---------------------------------");
        //변경 (수강권 양도)
        list.set(0, "이수근");
        System.out.println(list.get(0));

        //확인
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")){
            System.out.println("수강 신청 성공");
        }else{
            System.out.println("수강 신청 실패");
        }

        System.out.println("---------------------------------");
        //전체 삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비웠습니다");
        }

        System.out.println("---------------------------------");
        //새로운 학기가 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);// 정렬
        for (String s: list) {
            System.out.println(s);
        }


    }
}
