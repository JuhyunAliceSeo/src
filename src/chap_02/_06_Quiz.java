package chap_02;

public class _06_Quiz {
    public static void main(String[] args) {
        int height = 115;

        String s = (height >= 120) ? ("가능") : ("불가능");

        System.out.println("키가 " + height + "cm 이므로 탑승 " + s + "합니다.");

        height = 121;

        String s1 = (height >= 120) ? ("가능") : ("불가능");

        System.out.println("키가 " + height + "cm 이므로 탑승 " + s1 + "합니다.");


    }
}
