package Problem;

public class P08 {
    public static void change(int[][] arr) {
        int[] last = arr[arr.length - 1];
        for (int z = arr.length - 1; z > 0; z--) {
            arr[z] = arr[z - 1];
        }
        arr[0] = last;

    }

    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        change(arr);
        show(arr);
    }
}
