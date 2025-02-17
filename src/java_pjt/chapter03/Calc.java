package java_pjt.chapter03;

public class Calc {
    //    args => main메소드 매개변수
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("합계 : " + sum);
    }
}
