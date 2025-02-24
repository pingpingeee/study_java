package java_pjt.chapter09;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class WriteExample14 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/temp/output14.txt");
        String data = "ㅎ2 자바띠";
        writer.write(data, 3, 2); // 인덱스 3번엣허 2자를 읽어서 파일로 저장

        writer.close();
    }
}
