package java_pjt.question10;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수 >> ");
        int num = sc.nextInt();
        String[] str = new String[num];
        String[] numArr = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
            str[i] = sc.next();
            numArr[i] = sc.next();
        }
        System.out.println("저장되었습니다.");

        String s;
        while (true) {
            String result = "null";
            System.out.print("검색할 이름 >> ");
            s = sc.next();

            if (s.equals("그만")) break;
            for (int i = 0; i < num; i++) {
                if (str[i].equals(s)) result = numArr[i];
            }
            if (!result.equals("null")) {
                System.out.println(s + "의 번호는 " + result + "입니다.");
            } else {
                System.out.println(s + "이 없습니다");
            }
        }
    }
}
