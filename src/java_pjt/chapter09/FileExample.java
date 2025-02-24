package java_pjt.chapter09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
//        File dir = new File("C:/aaa");
        File dir = new File("C:/aaa/bbb");
        File file1 = new File("C:/aaa/file1.txt");
        File file2 = new File("C:/aaa/file2.txt");
        File file3 = new File("C:/aaa/file3.txt");

//        dir.mkdir() // 디렉토리만들기
        dir.mkdirs(); // 하위 디렉토리까지 같이 만들기
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();

        File test = new File("C:/aaa"); // 디렉토리 정보를 가지고 test 객체 생성
        File[] contents = test.listFiles(); // 디렉토리 정보를 가지고 옴 (하위 디렉토리 + 파일들)
        System.out.println("날짜\t\t\t시간\t\t\t형태\t\t크기\t\t이름");
        System.out.println("=================================================");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
        for (int i = 0; i < contents.length; i++) {
//            System.out.println(contents[i].lastModified()); // 마지막 생성일자
//            System.out.println(new Date(contents[i].lastModified())); // 마지막 생성일자
            System.out.print(sdf.format(new Date(contents[i].lastModified()))); // 마지막 생성일자

            if (contents[i].isDirectory()) {
                System.out.println("\t<DIR>\t\t" + contents[i].getName()); // 디렉토리나 파일 이름
            } else {
                System.out.println("\t\t\t" + contents[i].length() + "\t" + contents[i].getName()); // 디렉토리나 파일 이름
            }
        }
    }
}
