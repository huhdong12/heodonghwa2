import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        String str = "그만";
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("입력:");
        String name = sc.next();
        System.out.println(name);
        if (name.equals(str)) {
            System.out.println("hi");
        }
    }
}
