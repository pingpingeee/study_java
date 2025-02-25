package java_pjt.chapter10;

class ThreadEx1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i : " + i);
        }
    }
}

class ThreadEx2 implements Runnable {
    @Override
    public void run() {
        for (int j = 10; j < 15; j++) {
            System.out.println("j : " + j);
        }
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        ThreadEx1 thread1 = new ThreadEx1();
//        1 번 방식
//        Thread thread2 = new Thread(new ThreadEx2());
//        2 번 방식
        Runnable runnable = new ThreadEx2();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }

}
