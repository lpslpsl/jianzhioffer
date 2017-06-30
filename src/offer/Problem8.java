package offer;

/**
 * Created by lps on 2017/6/30.9:24
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的
 * 旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数
 * 组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为 1.
 */
public class Problem8 {
    public static void main(String[] args) {
        Problem8 problem8=new Problem8();
//        int arr[]={1,0,1,1,1};
        int arr[]={4,5,6,7,1,2,3};
       findMinNum(arr);
    }

    private static Integer findMinNum(int[] array){
        if (array==null){
            return null;
        }
        int leftIndex=0;
        int rightIndex=array.length-1;
        int mid=0;
        while (array[leftIndex]>=array[rightIndex]){
            System.out.println("lef="+leftIndex);
            System.out.println("rig="+rightIndex);
            System.out.println("arr[lef]="+array[leftIndex]);
            System.out.println("arr[rig]="+array[rightIndex]);
            if (rightIndex-leftIndex<=1){
                mid=rightIndex;
                break;
            }
            mid=(leftIndex+rightIndex)/2;
            System.out.println("mid="+mid);
            if (array[leftIndex]==array[rightIndex]&&array[leftIndex]==array[mid]){
                if (array[leftIndex+1]!=array[rightIndex-1]){
                    mid=array[leftIndex+1]<array[rightIndex-1]?leftIndex+1:rightIndex-1;
                    break;
                }else {
                    leftIndex++;
                    rightIndex--;
                }
            }else {
                if (array[mid]>=array[leftIndex]){
                    leftIndex=mid;
                }else {
                    if (array[mid]<=array[rightIndex]){
                        rightIndex=mid;
                    }
                }
            }
        }
        return  array[mid];
    }
}
