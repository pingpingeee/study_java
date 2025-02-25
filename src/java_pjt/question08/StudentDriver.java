package java_pjt.question08;

class Student {
    String name;
    String department;
    int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return ("이름 : " + name + "\n학번 : " + number + "\n소속학과 : " + department);
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("갑돌");
        student1.setNumber(100);
        student1.setDepartment("컴퓨터공학과");
        System.out.println(student1);

        Student student2 = new Student();
        student2.setName("갑순");
        student2.setNumber(200);
        student2.setDepartment("건축학과");
        System.out.println(student2);

        student2.setDepartment("수학과");
        System.out.println("소속학과 : " + student2.getDepartment());

    }
}
