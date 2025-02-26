package java_pjt.question09;

import java.util.Scanner;

abstract class Calc {
    int a, b;

    abstract void setValue(int a, int b);

    abstract int calculate();
}

class Add extends Calc {

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a + b;
    }
}

class Sub extends Calc {

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a - b;
    }
}

class Mul extends Calc {

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a * b;
    }
}

class Div extends Calc {

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate() {
        return a / b;
    }
}

public class Calculator {
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
