package java_pjt.question08;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {
            if (a.length > i) {
                c[i] = a[i];
            }
            if (i > a.length - 1) {
                c[i] = b[i - a.length];
            }
        }
        return c;
    }

    public static void print(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
}

public class StaticEx {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 9};
        int[] arr2 = {3, 6, -1, 100, 77};
        int[] arr3 = ArrayUtil.concat(arr1, arr2);
        ArrayUtil.print(arr3);
    }
}
