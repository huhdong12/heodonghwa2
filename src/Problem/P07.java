package Problem;

class Answer {
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void addTwoDArr(int[][] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            addOneDArr(arr[i], add);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class P07 {
    public static void main(String[] args) {
        int[][] arr = { { 11, 21, 31 }, { 44, 55, 77 } };
        Answer.addTwoDArr(arr, 12);
    }
}
