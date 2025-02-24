package java_pjt.chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:/temp/output3.txt");
        byte[] data = "DEF".getBytes();
        os.write(data);

        os.close();
    }
}
