package java_pjt.question10;

import java.util.ArrayList;
import java.util.Scanner;

class Member {
    int num;
    String id;
    String name;
    String area;

    public Member(String id, String name, String area) {
        num++;
        this.id = id;
        this.name = name;
        this.area = area;
    }

    public int getNum() {
        return num;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }
}


public class MemberAct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> list = new ArrayList<>();
        int choice = 0;

        while (true) {
            System.out.println("=====헬스클럽 회원관리 프로그램=====");
            System.out.println("1.회원 정보 관리 | 2. 프로그램 종료");
            System.out.println("================================");
            System.out.print("메뉴를 선택하세요 >> ");
            choice = sc.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("=====일반회원 정보관리=====");
                    System.out.println("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회원 정보확인 | 0.이전단계");
                    System.out.println("========================");
                    System.out.print("메뉴를 선택하세요 >> ");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 11:
                            System.out.print("가입할 회원 수를 입력하세요 >> ");
                            int insertNum = sc.nextInt();
                            for (int i = 0; i < insertNum; i++) {
                                System.out.println("회원정보를 입력하세요.");
                                System.out.print("회원 아이디 : ");
                                String insertId = sc.next();
                                System.out.print("회원 이름 : ");
                                String insertName = sc.next();
                                System.out.print("회원 지역 : ");
                                String insertArea = sc.next();
                                list.add(new Member(insertId, insertName, insertArea));
                            }
                            break;
                        case 22:
                            System.out.print("삭제할 회원번호를 입력하세요. >> ");
                            int removeNum = sc.nextInt();
                            list.remove(removeNum - 1);

                            for (int i = 0; i < list.size(); i++) {
                                Member member = list.get(i);
                                System.out.println("회원 번호 : " + (i + 1));
                                System.out.println("회원 아이디 : " + member.getId());
                                System.out.println("회원 이름 : " + member.getName());
                                System.out.println("회원 지역 : " + member.getArea());
                            }
                            break;
                        case 33:
                            System.out.println("등록된 회원수는 " + list.size() + "입니다.");
                            for (int i = 0; i < list.size(); i++) {
                                Member member = list.get(i);
                                System.out.println("회원 번호 : " + (i + 1));
                                System.out.println("회원 아이디 : " + member.getId());
                                System.out.println("회원 이름 : " + member.getName());
                                System.out.println("회원 지역 : " + member.getArea());
                            }
                            break;
                        case 0:
                            continue;
                    }
                }
            } else if (choice == 2) {
                System.out.println("프로그램종료");
                break;
            }
        }
    }
}
