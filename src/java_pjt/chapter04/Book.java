package java_pjt.chapter04;

public class Book {
    //    4. 멤버저장
//    멤버변수(필드)
    String title;
    String author;

    //    생성자
//    2. "어린왕자", "생텍쥐베리" 2개를 매개변수로 받음
    public Book(String title, String author) {
//        3. 매개변수를 멤버로 저장
        title = title;
        author = author;
    }

    public Book(String title) {
        title = title;
        author = "작자미상";
    }

    public static void main(String[] args) {
//        생성자가 없으면 컴파일러가 기본 생성자를 자동을 만들어서 호출
//        생성자가 하나라도 있으면 자동으로 기본생성자를 만들지 못 해서 매개변수에러
//        1. 매개변수를 가지고 생성자 호출
        Book littlePrince = new Book("어린왕자", "생텍쥐베리");
        Book loveStory = new Book("춘향전");

        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
