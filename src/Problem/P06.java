package Problem;

class Solution {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int e : arr) {
            if (max < e)
                max = e;
        }
        return max;
    }
}

public class P01 {
    public static void main(String[] args) {
        int[] arr = { 100, 3, 45, 67, 210, 88 };
        System.out.println(Solution.minValue(arr));
        System.out.println(Solution.maxValue(arr));
    }
}
