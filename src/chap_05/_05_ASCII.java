package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키코드(ANSI) : 미국 표준 코드
        // 대문자는 65부터 시작,소문자는 97부터 시작, 숫자(0)는 48부터 시작

        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);


        c++;
        System.out.println(c);
        System.out.println((int)c);

        // 세로 크기 10 x 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        //영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
