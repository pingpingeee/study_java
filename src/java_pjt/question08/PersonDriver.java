package java_pjt.question08;

import java.util.Scanner;

class Person {
    public String lastName;
    public String firstName;

    public Person() {
    }

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getLength() {
        int num = lastName.length() + firstName.length();
        return num;
    }
}

public class PersonDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname;
        String lname;

        System.out.print("성을 입력하세요 >> ");
        lname = sc.nextLine();
        System.out.print("이름을 입력하세요 >> ");
        fname = sc.nextLine();
        Person person1 = new Person();
        person1.lastName = lname;
        person1.firstName = fname;
        System.out.println("성 : " + person1.getLastName() + " 이름 : " + person1.getFirstName() +
                "성명의 길이 : " + person1.getLength());


        System.out.print("성을 입력하세요 >> ");
        lname = sc.nextLine();
        System.out.print("이름을 입력하세요 >> ");
        fname = sc.nextLine();
        Person person2 = new Person(lname, fname);
        System.out.println("성 : " + person2.getLastName() + " 이름 : " + person2.getFirstName() +
                "성명의 길이 : " + person2.getLength());
    }
}
