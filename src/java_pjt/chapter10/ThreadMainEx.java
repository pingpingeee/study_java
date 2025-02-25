package java_pjt.chapter10;

public class ThreadMainEx {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName(); // 현재 실행중인 스레드의 이름
        long id = Thread.currentThread().threadId(); // 현재 실행중인 스레드의 고유한 번호
//        main 메소드의 스레드 우선순위 초기값은 5
        int priority = Thread.currentThread().getPriority(); // 현재 실행중인 스레드의 우선순위
        Thread.State s = Thread.currentThread().getState(); // 현재 실행중인 스레드의 상태

        System.out.println("현재 스레드 이름 : " + name);
        System.out.println("현재 스레드 ID : " + id);
        System.out.println("현재 스레드 우선순위 : " + priority);
        System.out.println("현재 스레드 상태 : " + s);
    }
}
