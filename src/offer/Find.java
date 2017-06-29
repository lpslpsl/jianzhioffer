package offer;

/**
 * Created by lps on 2017/6/29.10:32 二维数组查找
 * 一个二维数组，每一行从左到右递增，每一列从上到下递增．输
 * 入一个二维数组和一个整数，判断数组中是否含有整数。
 */
public class Find {
    public static boolean find(int[][] array, int number) {
        if (array == null) return false;
        int colum = array[0].length - 1;//第一列
        int row = 0;
        while (row < array.length && colum >= 0) {
            System.out.println("row="+row);
            System.out.println("colum="+colum);
            System.err.println(array[row][colum]);
            if (array[row][colum] == number) return true;
            if (array[row][colum] > number) colum--;
            //倒着查找，如果0行某列比他大，那该列的下面行数必然比他更大，所以直接colum--，如果比他小
            //就看看该列 其他行有没有正好的，如果没有就--，继续查找
            else row++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] testarray=new int[4][4];
        testarray[0][0]=1;
        testarray[0][1]=2;
        testarray[0][2]=8;
        testarray[0][3]=9;
        testarray[1][0]=2;
        testarray[1][1]=4;
        testarray[1][2]=9;
        testarray[1][3]=12;
        testarray[2][0]=4;
        testarray[2][1]=7;
        testarray[2][2]=10;
        testarray[2][3]=13;
        testarray[3][0]=6;
        testarray[3][1]=8;
        testarray[3][2]=11;
        testarray[3][3]=15;
        System.out.println(find(testarray, 13));
    }
}
