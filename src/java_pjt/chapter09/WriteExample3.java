package java_pjt.chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:/temp/output4.txt");
        byte[] data = "DEF".getBytes();
        os.write(data, 1, 2); // EF => 인덱스 1에서 2글자
        os.flush();

        os.close();
    }
}
