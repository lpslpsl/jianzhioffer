package offer;

/**
 * Created by lps on 2017/7/5.10:01
 * 输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，使得
 * 所有奇数位于数组的前半部分，所有的数组位于数组的后半部分。
 */
public class Problem14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        order(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void order(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            while (!isEven(arr[start])) {
                start++;
            }
            while (isEven(arr[end])) {
                end--;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
