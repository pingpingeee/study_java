package java_pjt.chapter09;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class WriteExample12 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/temp/output12.txt");
        char[] data = "홍길동2".toCharArray();
        writer.write(data);

        writer.close();
    }
}
