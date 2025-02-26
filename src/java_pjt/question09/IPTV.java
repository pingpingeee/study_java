package java_pjt.question09;

public class IPTV extends TV {
    String ip;
    int color;

    public IPTV(String ip, int size, int color) {
        super(size);
        this.ip = ip;
        this.color = color;
    }

    void printProperty() {
        System.out.println("나의 IPTV는 " + ip + "주소의 " + getSize() + "인치 " + color + "컬러");
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("191.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
