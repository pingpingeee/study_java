package java_pjt.chapter05_02_interface;

interface PhoneInterface2 {
    int TIMEOUT = 100;

    void sendCall();

    void receiveCall();

    default void printLogo() {
        System.out.println("** Phone **");
    }
}

// 인터페이스끼리의 상속이기에 extends
interface MobilePhoneInterface extends PhoneInterface2 {
    void sendSMS();

    void receiveSMS();
}

interface MP3Interface {
    void play();

    void stop();
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

    @Override
    public void play() {
        System.out.println("음악 시작");
    }

    @Override
    public void stop() {
        System.out.println("음악 중단");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자감");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔음");
    }

    @Override
    public void sendCall() {
        System.out.println("링링링링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔음");
    }

    public void schedule() {
        System.out.println("일정관리");
    }
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println(phone.calculate(3, 5));
        phone.schedule();
    }
}
