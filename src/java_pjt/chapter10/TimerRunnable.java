package java_pjt.chapter10;

public class TimerRunnable implements Runnable {
    int n = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println(n);
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
