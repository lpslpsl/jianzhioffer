package offer;

/**
 * Created by lps on 2017/6/29.10:25
 * 懒汉式单例模式
 */
public class SignleTonClassLayz {
    private static SignleTonClassLayz signleTonClassLayz=null;
    private SignleTonClassLayz() {
    }
    public synchronized static SignleTonClassLayz getInstance(){
        if (signleTonClassLayz==null){
            signleTonClassLayz=new SignleTonClassLayz();
        }
        return signleTonClassLayz;
    }
//另附上两种其他实现
    /**
     * 双重校验
     * @return
     */
    public static SignleTonClassLayz getSignleTonClassLayz(){
        if (signleTonClassLayz==null){
            synchronized (SignleTonClassLayz.class){
                if (signleTonClassLayz==null){
                    signleTonClassLayz=new SignleTonClassLayz();
                }
            }
        }
        return signleTonClassLayz;
    }

    /**
     * 静态内部类实现
     * @return
     */
    public static SignleTonClassLayz getInstancE(){
        return SigntonHodler.signleTonClassLayz;
    }
    static class  SigntonHodler{
       static SignleTonClassLayz signleTonClassLayz=new SignleTonClassLayz();
    }
}
