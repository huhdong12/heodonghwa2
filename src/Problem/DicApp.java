package Problem;

import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    static int i;

    public void run() {
        String stop = "그만";
        Scanner sc = new Scanner(System.in);
        System.out.print("한글 단어?");
        String num = sc.next();
        if (num.equals(stop)) {
            return;
        }
        System.out.println(kor2Eng(num));
        run();
    }

    public static String kor2Eng(String word) {
        /* 검색 코드 작성 */
        for (i = 0; i <= 4; i++) {
            if (word.equals(kor[i])) {
                return word + "은 " + eng[i];
            }
        }
        return word + "는 저의 사전에 없습니다.";
    }
}

public class DicApp {
    public static void main(String[] args) {
        Dictionary a1 = new Dictionary();
        System.out.println("한영 단어 검색 프로그램입니다.");
        a1.run();
    }
}
