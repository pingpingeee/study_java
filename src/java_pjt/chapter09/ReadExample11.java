package java_pjt.chapter09;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample11 {
    public static void main(String[] args) throws IOException {
//        Reader => 문자 단위 입력을 위한 최상위 스트림 클래스
//        FileReader => 문자 단위 입력을 위한ㅁ 하위 스트림 클래스
        Reader reader = new FileReader("C:\\temp\\test.txt");
        int readData;

        while (true) {
            readData = reader.read();
            if (readData == -1) break;
            System.out.print((char) readData);
        }
        reader.close();
    }
}
