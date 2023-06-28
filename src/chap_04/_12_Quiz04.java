package chap_04;

public class _12_Quiz04 {
    public static void main(String[] args) {
        int hour = 10; //주차시간
        boolean isSmallCar = true; //경차여부
        boolean withDisabledPerson = false; //장애인 차량여부

        int parkingRate = 4000 * hour; //주차요금

        if(parkingRate>=30000) {
            parkingRate = 30000;
        }
        if (isSmallCar || withDisabledPerson) {
            parkingRate = parkingRate / 2;
        }

        //실행결과 출력

        System.out.println("주차 요금은 " + parkingRate + "입니다.");


    }

}
