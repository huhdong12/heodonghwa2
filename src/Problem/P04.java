package Problem;

import java.util.Scanner;

class Add {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a + b;
    }

}

class Sub {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a - b;
    }

}

class Mul {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a * b;
    }

}

class Div {
    private int a;
    private int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a / b;
    }

}

public class P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        if (c.equals("+")) {
            Add a1 = new Add();
            a1.setValue(a, b);
            System.out.println(a1.calculate());
        } else if (c.equals("-")) {
            Sub a2 = new Sub();
            a2.setValue(a, b);
            System.out.println(a2.calculate());
        } else if (c.equals("*")) {
            Mul a3 = new Mul();
            a3.setValue(a, b);
            System.out.println(a3.calculate());
        } else if (c.equals("/")) {
            Div a4 = new Div();
            a4.setValue(a, b);
            System.out.println(a4.calculate());
        }
    }
}
