package java_pjt.question03;

public class ContinueSmaYukGu {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.print("짝 ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
