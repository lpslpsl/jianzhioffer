package offer;

/**
 * Created by lps on 2017/6/30.10:23
 * 实现函数 double Power（double base， int exponent），求 base 的 exponent
 次方。不得使用库函数，同时不需要考虑大数问题。
 */
public class Problem11 {
    public static void main(String[] args) throws Exception {
        System.out.println(power(2,3));
    }
    public static double power(double base,int exponted) throws Exception {
        double result=0;
        if ((base<0.000001||base>-0.0000001)&&exponted<0){
            throw new Exception("0的负数次方没有意义");
        }
        if (exponted<0){
            result=1.0/powerwithExpoment(base,-exponted);
        }else {
            result=powerwithExpoment(base,exponted);
        }
        return  result;
    }

    private static double powerwithExpoment(double base, int e) {
        if (e==0)return 1;
        if (e==1)return base;
        double result=1.0;
        for (int i = 0; i < e; i++) {
            result=result*base;
        }
        return result;
    }
}
