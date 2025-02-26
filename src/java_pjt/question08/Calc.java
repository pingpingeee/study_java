package java_pjt.question08;

import java.util.Scanner;

class Add {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a + b;
    }
}

class Sub {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a - b;
    }
}

class Mul {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a * b;
    }
}

class Div {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a / b;
    }
}

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자 입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        if (c == '+') {
            Add add = new Add();
            add.setValue(a, b);
            System.out.println(add.calculate());
        } else if (c == '-') {
            Sub sub = new Sub();
            sub.setValue(a, b);
            System.out.println(sub.calculate());
        } else if (c == '*') {
            Mul mul = new Mul();
            mul.setValue(a, b);
            System.out.println(mul.calculate());
        } else if (c == '/') {
            Div div = new Div();
            div.setValue(a, b);
            System.out.println(div.calculate());
        }
    }
}
