package offer;

/**
 * Created by lps on 2017/6/30.9:50
 * 写一个函数，输入 n，求斐波那契数列的第 n 项。
 */
public class Fibonacci {
    public static long fibonacci(int n) {
        long result = 0;
        long preone = 0;
        long pretwo = 1;
        if (n == 0) return preone;
        if (n == 1) return pretwo;
        for (int i = 2; i < n; i++) {
            System.out.println(preone);
            System.out.println(pretwo);
            result = preone + pretwo;//相加，然后把第一个数换成下一个，下一个换成刚刚的result以准备进行下一次运算
            preone = pretwo;
            pretwo = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
