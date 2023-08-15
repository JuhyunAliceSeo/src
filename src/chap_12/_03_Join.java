package chap_12;

import chap_12.Clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss(){
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10; i +=2){
            System.out.println("(사장)" + i +" 번방 청소 중");
            try {
                Thread.sleep(1000); //1초기간
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--사장 청소 끝--");
    }
}
