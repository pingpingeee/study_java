package java_pjt.chapter10;

public class TestRunnable {
    public static void main(String[] args) {
//        Runnable 로 만든 스레드는 Thread 객체의 생성자로 호출
        Thread thread = new Thread(new TimerRunnable());
        thread.start();
    }
}
