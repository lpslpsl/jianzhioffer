package offer;

import java.util.Arrays;

/**
 * Created by lps on 2017/6/29.14:10
 * 题目描述：输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设前
 * 序遍历和中序遍历结果中都不包含重复的数字，例如输入的前序遍历序列
 * {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}重建出如图所示的二叉
 * 树。
 */
public class BinaryTreeNode {
    public static int value;
    public BinaryTreeNode leftNode;
    public BinaryTreeNode rightNode;
}

class Problem6 {
    public static void main(String[] args) throws Exception {
        int[] preSort = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inSort = {4, 7, 2, 1, 5, 3, 6, 8};
        BinaryTreeNode binaryTreeNode = constructCore(preSort, inSort);
    }

    private static BinaryTreeNode constructCore(int[] preSort, int[] inSort) throws Exception {
        if (preSort == null || inSort == null) {
            return null;
        }
        if (preSort.length != inSort.length) {
            throw new Exception("长度不一致");
        }
        BinaryTreeNode root = new BinaryTreeNode();
        for (int i = 0; i < inSort.length; i++) {
            if (inSort[i] == preSort[0]) {
                root.value = inSort[i];
                System.out.println(root.value);
                int[] leftnode_pre = Arrays.copyOfRange(preSort, 1, i + 1);
                int[] letfnode_in = Arrays.copyOfRange(inSort, 0, i);
                System.err.println("leftnode_pre"+Arrays.toString(leftnode_pre));
                System.err.println("leftnode_in"+Arrays.toString(letfnode_in));
                root.leftNode = constructCore(leftnode_pre, letfnode_in);
                int[] rightnode_pre = Arrays.copyOfRange(preSort, i + 1, preSort.length);
                int[] rightnode_in = Arrays.copyOfRange(inSort, i + 1, inSort.length);
                System.err.println("rightnode_pre"+Arrays.toString(rightnode_pre));
                System.err.println("rightnode_in"+Arrays.toString(rightnode_in));
                root.rightNode = constructCore(rightnode_pre, rightnode_in);
            }
        }
        return root;
    }
}