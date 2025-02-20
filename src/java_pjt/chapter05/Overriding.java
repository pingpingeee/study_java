package java_pjt.chapter05;

class Weapon {
    protected int fire() {
        return 1;
    }
}

class Cannon extends Weapon {

    // 서브클래스에서 재정의되는 메서드에 어노테이션
    @Override
    protected int fire() {
        return 10;
    }
}

public class Overriding {
    public static void main(String[] args) {
//        Weapon weapon = new Weapon();
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력 : " + weapon.fire());

        weapon = new Cannon();
        System.out.println("대포 무기의 살상 능력 : " + weapon.fire());
//        Weapon weapon2 = new Cannon(); // 업캐스팅
//        System.out.println("태포 무기의 살상 능력 : " + weapon2.fire());
    }
}
