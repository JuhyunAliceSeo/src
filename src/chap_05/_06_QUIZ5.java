package chap_05;

public class _06_QUIZ5 {
    public static void main(String[] args) {
//        String[] shoes = new String[10];
//        int size = 250;
//        for (int i = 0; i < shoes.length; i ++) {
//            System.out.println("신발 사이즈 " + (size += 5) + " (재고있음)");
//        };

        //////////

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + ( 5 * 1);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고있음)");
        }

    }
}
