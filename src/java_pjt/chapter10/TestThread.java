package java_pjt.chapter10;

public class TestThread {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread();
        thread.start();
    }
}
