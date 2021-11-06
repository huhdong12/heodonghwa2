package Problem;

import java.util.Arrays;
import java.util.Scanner;

class Go {
    Scanner sc = new Scanner(System.in);
    String[] S = { "___", "___", "___", "___", "___", "___", "___", "___", "___", "___" };
    String[] A = { "___", "___", "___", "___", "___", "___", "___", "___", "___", "___" };
    String[] B = { "___", "___", "___", "___", "___", "___", "___", "___", "___", "___" };

    public void look() {
        System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
        int num1 = sc.nextInt();
        if (num1 == 1)
            book();
        else if (num1 == 2)
            view();
        else if (num1 == 3)
            cancel();
        else if (num1 == 4)
            finish();
        else {
            System.out.println("재선택 하세요.");
            look();
        }
    }

    public void book() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int num2 = sc.nextInt();
        if (num2 == 1) {
            System.out.println("S>>" + " " + S[0] + " " + S[1] + " " + S[2] + " " + S[3] + " " + S[4] + " " + S[5] + " "
                    + S[6] + " " + S[7] + " " + S[8] + " " + S[9]);
            System.out.print("이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int number = sc.nextInt();
            S[number - 1] = name;
            look();
        } else if (num2 == 2) {
            System.out.println("A>>" + " " + A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4] + " " + A[5] + " "
                    + A[6] + " " + A[7] + " " + A[8] + " " + A[9]);
            System.out.print("이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int number = sc.nextInt();
            A[number - 1] = name;
            look();
        } else if (num2 == 3) {
            System.out.println("B>>" + " " + B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4] + " " + B[5] + " "
                    + B[6] + " " + B[7] + " " + B[8] + " " + B[9]);
            System.out.print("이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int number = sc.nextInt();
            B[number - 1] = name;
            look();
        } else {
            System.out.println("재선택 하세요.");
            book();
        }
    }

    public void view() {
        System.out.println("S>>" + " " + S[0] + " " + S[1] + " " + S[2] + " " + S[3] + " " + S[4] + " " + S[5] + " "
                + S[6] + " " + S[7] + " " + S[8] + " " + S[9]);
        System.out.println("A>>" + " " + A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4] + " " + A[5] + " "
                + A[6] + " " + A[7] + " " + A[8] + " " + A[9]);
        System.out.println("B>>" + " " + B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4] + " " + B[5] + " "
                + B[6] + " " + B[7] + " " + B[8] + " " + B[9]);
        System.out.println("<<<조회를 완료하였습니다.>>>");
        look();
    }

    public void cancel() {
        System.out.print("좌석 S:1, A:2, B:3>>");
        int number2 = sc.nextInt();
        if (number2 == 1) {
            System.out.println("S>>" + " " + S[0] + " " + S[1] + " " + S[2] + " " + S[3] + " " + S[4] + " " + S[5] + " "
                    + S[6] + " " + S[7] + " " + S[8] + " " + S[9]);
            System.out.print("이름>>");
            String name2 = sc.next();
            for (int i = 0; i <= 9; i++) {
                if (name2.equals(S[i])) {
                    S[i] = "___";
                }
            }
            look();
        } else if (number2 == 2) {
            System.out.println("A>>" + " " + A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4] + " " + A[5] + " "
                    + A[6] + " " + A[7] + " " + A[8] + " " + A[9]);
            System.out.print("이름>>");
            String name2 = sc.next();
            for (int i = 0; i <= 9; i++) {
                if (name2.equals(A[i])) {
                    A[i] = "___";
                }
            }
            look();
        } else if (number2 == 3) {
            System.out.println("B>>" + " " + B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4] + " " + B[5] + " "
                    + B[6] + " " + B[7] + " " + B[8] + " " + B[9]);
            System.out.print("이름>>");
            String name2 = sc.next();
            for (int i = 0; i <= 9; i++) {
                if (name2.equals(B[i])) {
                    B[i] = "___";
                }
            }
            look();
        } else {
            System.out.println("재선택 하세요.");
            cancel();
        }

    }

    public void finish() {
        return;
    }

}

public class P05 {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Go a1 = new Go();
        a1.look();
    }
}
