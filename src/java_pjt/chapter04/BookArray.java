package java_pjt.chapter04;

import java.util.Scanner;

class Book3 {
    String title;
    String author;

    public Book3(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book3[] book = new Book3[2];

        for (int i = 0; i < book.length; i++) {
            System.out.print("제목 입력 : ");
//            String title = sc.next();
            String title = sc.nextLine();
            System.out.print("저자 입력 : ");
//            String author = sc.next();
            String author = sc.nextLine();
            book[i] = new Book3(title, author);
        }

        for (int i = 0; i < book.length; i++) {
            System.out.println("(" + book[i].title + ", " + book[i].author + ")");
        }
    }
}
