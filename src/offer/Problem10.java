package offer;

/**
 * Created by lps on 2017/6/30.10:05
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如
 把 9 表示成二进制是 1001；有 2 位是 1，因此如果输入 9，函数输出 2.
 */
public class Problem10 {
    public static void main(String[] args) {
        System.out.println(numberOf1(9));
    }

    /**
     * 通过&运算
     * @param num
     * @return
     */
    public static int numberOf1(int num){
        int count=0;
        while (num!=0){
            count++;
            System.out.println(num);
            num=(num-1)&num;
            System.err.println(num);

        }
        return count;
    }

    /**
     * 转成字符串，在进行判断
     * @param n
     * @return
     */
    public static  int numof1(int n){
        int count=0;
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c=='1'){
                count++;
            }
        }
        return  count;
    }
}
