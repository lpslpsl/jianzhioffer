package offer;

import java.util.Stack;

/**
 * Created by lps on 2017/6/29.16:09
 * 用两个栈实现一个队列，实现对了的两个函数 appendTail 和
 * deleteHead，分别完成在队列尾插入结点和在队列头部删除结点的功能。
 */
public class Problem7<T> {
    public static void main(String[] args) throws Exception {
        Problem7 problem7 = new Problem7();
        problem7.appendTail(1);
        problem7.appendTail(2);
        problem7.appendTail(3);
        Object o = problem7.deleteHead();
        System.out.println(o);
        problem7.appendTail(4);
        System.out.println(problem7.deleteHead());
    }

    private Stack<T> stack1 = new Stack<T>();
    private Stack<T> stack2 = new Stack<T>();

    public void appendTail(T t) {
        stack1.push(t);
    }

    public T deleteHead() throws Exception {
        if (stack2.isEmpty()) {//如果为空，吧stack1的数据入栈，否则直接出栈即可
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new Exception("队列为空");
        }
        return stack2.pop();

    }
}
