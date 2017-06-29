package offer;

/**
 * Created by lps on 2017/6/29.10:50
 * 替换空格
 * 请实现一个函数，把字符串中的每个空格替换成“%20”
 */
public class ReplaceBlank {
    /**
     * 不使用String自带的实现
     *
     * @param input
     * @return
     */
    public static String replaceblank(String input) {
        if (input == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0, j = input.length(); i < j; i++) {
            if (input.charAt(i) == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(String.valueOf(input.charAt(i)));
            }
        }
        return stringBuffer.toString();
    }

    /**
     * 使用String自带的方法实现
     *
     * @param input
     * @return
     */
    public static String rep(String input) {
        return input.replace(" ", "%20");
    }

    public static void main(String[] args) {
        String s = "oafa; d.,fmsagl sagds";
        String replaceblank = rep(s);
        System.out.println(replaceblank);
    }
}
