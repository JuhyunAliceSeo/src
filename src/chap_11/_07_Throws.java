package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writerFile();
        } catch (IOException e) {
            System.out.println("메인메소드에서 해결할께요");;
        }

    }

    public static void writerFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일쓰기에 실패했어요!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요");
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일쓰기에 실패했어요!!");
    }
}
