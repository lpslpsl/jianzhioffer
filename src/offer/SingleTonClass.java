package offer;

/**
 * Created by lps on 2017/6/29.
 * 饿汉式单例
 */
public class SingleTonClass {
  private  static final SingleTonClass singleTonClass=new SingleTonClass();

    private SingleTonClass() {//私有化构造函数
    }

    public static SingleTonClass getInstance(){
        return singleTonClass;
    }
}
