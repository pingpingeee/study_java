package java_pjt.chapter09;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample12 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:\\temp\\test.txt");
        int readData;
        char[] cbuf = new char[2];
        String data = "";

        while (true) {
            readData = reader.read(cbuf);
            if (readData == -1) break;
//            System.out.print((char) readData);
            data += new String(cbuf, 0, readData);
        }
        reader.close();
    }
}
