package java_pjt.chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
//        FileOutputStream => 바이트 단위 출력을 위한 하위 스트림 클래스
//        FileOutputStream output.txt 를 가지고 객체 생성
//        OutputStream os = new FileOutputStream("C:\\temp\\output.txt");
//        백슬래시 대신에 슬래시 사용가능
        OutputStream os = new FileOutputStream("C:/temp/output.txt");
//        바이트 단위로 문자열을 읽음
        byte[] data = "ABC".getBytes();
        for (int i = 0; i < data.length; i++) {
//            FileOutputStream 객체에 바이트 배열원소를 넣음
            os.write(data);
        }
        os.close();
    }
}
