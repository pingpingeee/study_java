package java_pjt.chapter04;

public class Book2 {
    String title;
    String author;

    public Book2(String title, String author) {
        System.out.println("생성자1 호출");
//        매개변수를 this 자기 자신의 객체 멤버로 저장
        this.title = title;
        this.author = author;
    }

    public Book2(String title) {
//        매개변수 두개인 this, 생성자1을 호출
        this(title, "작자미상");
        System.out.println("생성자2 호출");
    }

    public Book2() {
//        매개변수 두개인 this, 생성자1을 호출
        this("", "");
        System.out.println("생성자3 호출");
    }

    void show() {
        System.out.println(title + " " + author);
    }

    public static void main(String[] args) {
        Book2 littlePrince = new Book2("어린왕자", "생텍쥐베리");
        Book2 loveStory = new Book2("춘향전");
        Book2 emptyBook = new Book2();

        littlePrince.show();
        loveStory.show();
        emptyBook.show();
    }
}
