package java_pjt.chapter02;

public class Cylinder {
    public static void main(String[] args) {
        double r = 7;
        double h = 5;

        double result = volume(r, h);

        System.out.println("반지름 : " + r + ", 높이 : " + h + "인 원기둥의 부피 : " + result);
    }

    public static double volume(double radius, double height) {
//        원기둥 부피 구하기
        return Math.PI * radius * radius * height;
    }
}
