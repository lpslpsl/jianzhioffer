package offer;

/**
 * Created by lps on 2017/6/30.10:53
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位进制数。比如输入 3，则打
 印出 1、 2、 3 一直到 999.
 */
public class Problem12 {
    public static void main(String[] args) {
printToMaxOfNDigits(2);
    }
    public static void myPrint(long n){
        for (int i = 0; i <Math.pow(10,n); i++) {
            System.out.println(i);
        }
    }
    public static void printToMaxOfNDigits(int n){
        int[] arr=new int[n];
        if (n<0)return;
        printArr(arr,0);
        System.out.println(count);
    }
static int count=0;
    private static void printArr(int[] arr, int n) {
        count++;
        for (int i = 0; i < 10; i++) {
            if (n!=arr.length){
                arr[n]=i;
                printArr(arr,n+1);
            }else {
                boolean isFirstNo0=false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != 0) {//首位数字，不能为0
                        System.out.print(arr[j]);
                        if (!isFirstNo0) {
                            isFirstNo0 = true;
                        }
                    }else {
                        if (isFirstNo0){
                            System.out.print(arr[j]);
                        }

                    }
                }
                System.out.println();
                return;
            }
        }

    }
}
