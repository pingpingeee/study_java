package java_pjt.chapter03;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
            System.out.println("클래스 찾음");
        } catch (ClassNotFoundException e) {
//        } catch (Exception e) {
            System.out.println("클래스 못 찾음");
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String");
//    public static void findClass() {
//        try {
//            Class.forName("java.lang.String2");
//            System.out.println("클래스 찾음2");
//        } catch (ClassNotFoundException e) {
//            System.out.println("클래스 못 찾음 2");
//        }
    }
}
