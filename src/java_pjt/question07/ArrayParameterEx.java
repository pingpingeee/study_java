package java_pjt.question07;

public class ArrayParameterEx {
    static void printStringArray(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
        System.out.println();
    }

    static void replaceBe(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].replace("be", "eat");
        }
    }

    public static void main(String[] args) {
        String[] strArr = new String[]{"to", " ", "be", " ", "or", " ", "not", " ", "to", " ", "be"};
        printStringArray(strArr);
        replaceBe(strArr);
        printStringArray(strArr);
    }
}
