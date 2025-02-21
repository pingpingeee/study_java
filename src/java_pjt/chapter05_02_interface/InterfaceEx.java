package java_pjt.chapter05_02_interface;

interface PhoneInterface {
    //    public static final int TIMEOUT = 100;
    int TIMEOUT = 100; // public static final 생략

    //    public abstract void sendCall();
    void sendCall(); // public abstract 생략

    void receiveCall();

    // 구현하면 default 꼭 작성해야함
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("링링링링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash() {
        System.out.println("전화기에 불이 켜짐");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
