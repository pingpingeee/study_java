package java_pjt.question07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String max = "";

        for (int i = 0; i < 4; i++) {
            System.out.print("이름 입력 : ");
            list.add(sc.nextLine());
            if (list.get(i).length() > max.length()) max = list.get(i);
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n가장 긴 이름 : " + max);

//        int index = 0;
//        for (int i = 0; i < 4; i++) {
//            if (list.get(index).length() < list.get(i).length()) {
//                index = i;
//            }
//        }
//        System.out.println("\n가장 긴 이름 : " + list.get(index));
    }
}
