package chap_03;

public class _05_Quiz {
    public static void main(String[] args) {
        String idNumber = "901231-1234567";

        System.out.println(idNumber.substring(0,8));
        System.out.println(idNumber.substring(0,idNumber.indexOf("-")+2));
        //idNumber.indexOf("-")+2 = -뒤에 +2 직전까지.

        idNumber = "001231-1234500";
        System.out.println(idNumber.substring(0,8));
    }
}
