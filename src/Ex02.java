import java.util.Arrays;
import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

class PhonBook {
    Scanner sc = new Scanner(System.in);
    static int num;

    public void input() {
        String stop = "그만";
        System.out.print("인원수 >> ");
        num = sc.nextInt();
        Phone array[] = new Phone[num + 1];
        for (int i = 1; i <= num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            array[i] = new Phone();
            String name = sc.next();
            array[i].setName(name);
            String tel = sc.next();
            array[i].setTel(tel);
        }
        System.out.println("저장되었습니다...");
        Loop1:
        for (int i = 0; ; i++) {
            System.out.print("검색할 이름 >>");
            String name2 = sc.next();
            if (stop.equals(name2)) {
                break;
            }

            Loop2:
            for (int j = 1; j <= num; j++) {
                if (name2.equals(array[j].getName())) {
                    System.out.println(name2 + "의 번호는 " + array[j].getTel() + " 입니다.");
                    continue Loop1;
                }
            }
            System.out.println(name2 + "이 없습니다.");
        }
    }
}

public class Ex02 {
    public static void main(String[] args) {
        PhonBook a1 = new PhonBook();
        a1.input();
    }
}
