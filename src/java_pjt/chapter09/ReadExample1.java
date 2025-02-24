package java_pjt.chapter09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
    public static void main(String[] args) throws IOException {
//        InputStream => 바이트 단위 입력을 위한 최상위 스트림 클래스
//        FileInputStream => 바이트 단위 입력을 위한 하위 스트림 클래스
        InputStream is = new FileInputStream("C:\\temp\\test.txt");
        int readByte;

        while ((readByte = is.read()) != -1) {
            System.out.print((char) readByte);
        }

//        while (true) {
//            readByte = is.read(); // byte 단위로 읽는다. (정수로 받음)
////            파일의 끝에는 -1이 존재 => EOF
//            if (readByte == -1) break;
////            System.out.println(readByte);
//            System.out.print((char)readByte);
//        }
        is.close();
    }
}
