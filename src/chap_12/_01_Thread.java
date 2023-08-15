package chap_12;

import chap_12.Clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 쓰레드 : 우리가 만드는 프로그램(exe)을 더블클릭해서 실행하면 실행되는 상태를 프로세스라고 한다.
        // 프로세스의 자원을 해서 실제로 작업을 수행하는것을 쓰레드라고 한다.
        // 프로세스 = 여러개의 쓰레드를 가지고 있다.

        // 1 3 5 7 9
        // 2 4 6 8 10

        //cleanBySelf();
        CleanThread cleanThread = new CleanThread();

        //cleanThread.run(); //직원청소
        cleanThread.start();
        cleanByBoss(); //사장청소


    }

    public static void cleanBySelf(){
        System.out.println("--혼자서 청소 시작--");
        for (int i = 1; i <= 10; i ++){
            System.out.println("(혼자)" + i +" 번방 청소 중");
        }
        System.out.println("--혼자 청소 끝--");
    }

    public static void cleanByBoss(){
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10; i +=2){
            System.out.println("(사장)" + i +" 번방 청소 중");
        }
        System.out.println("--사장 청소 끝--");
    }
}
