package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try{
            System.out.println("택시의 문을 연다");
            throw new Exception("휴무택시");
            //System.out.println("택시에 탑승한다.");
        } catch (Exception e){
            System.out.println("!!문제 발생 : " + e.getMessage()); //택시의 문을 연다 // !!문제 발생 : 휴무택시
        } finally { // 에러 발생 여부와 상관없이 파이널 구문을 실행한다
            System.out.println("택시의 문을 닫는다.");
        }

        //try + catch(s)
        //try + catch(s) + finally
        //try + finally

        System.out.println("-----------------");

        try{
            System.out.println(3 / 0);
        }finally{
            System.out.println("프로그램 정상종료");
        }
    }
}
