package java_pjt.chapter05;

/**
 * instanceof 연산자 사용(상속)
 */
class Person {
}

class Student extends Person {
}

class Researcher extends Person {
}

class Professor extends Researcher {
}

public class InstanceofEx {
    //    Person p = new Student() -> 업캐스팅
    static void print(Person person) {
        if (person instanceof Person) System.out.print("Person ");
        if (person instanceof Student) System.out.print("Student ");
        if (person instanceof Researcher) System.out.print("Researcher ");
        if (person instanceof Professor) System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() => ");
        print(new Student()); // Person Student
        System.out.print("new Researcher() => ");
        print(new Researcher()); // Person Researcher
        System.out.print("new Professor() => ");
        print(new Professor()); // Person Researcher Professor
    }
}
