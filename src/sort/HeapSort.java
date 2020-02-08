package sort;

import com.sun.media.jfxmedia.events.BufferListener;

import java.security.PrivateKey;
import java.util.Arrays;

/**
 * @auther hhh
 * @date 2020/2/5 21:41
 * @description 堆排：完全二叉树，分为最大堆与最小堆
 * 通过数组来模拟二叉树的数据结构
 * 假设父索引为parent，左孩子的index为2*parent+1，右边孩子为2*parent+2
 */
public class HeapSort {
    public static void main(String[] args) {
        int []arr = new int[]{1,3,2,6,5,7,8,0,10,9};
        buildHeap(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 上浮调整
     *
     * @param arr 需要调整的堆
     */
    private static void upAdjust(int[] arr) {
        int childIndex = arr.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        //用于保存插入的叶子节点的值，用于最后的赋值
        int temp = arr[childIndex];
        while (childIndex > 0 && temp < arr[parentIndex]) {
            //无需真正交换
            arr[childIndex] = arr[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        arr[childIndex] = temp;
    }

    /**
     * 下沉调整
     * @param arr 需要调整的堆
     * @param parentIndex 要下沉的父节点
     * @param length 堆的有效大小
     */
    private static void downAdjust(int arr[],int parentIndex,int length){
        int tmp = arr[parentIndex];
        int childIndex = 2*parentIndex+1;
        while (childIndex<length){
            //若有右孩子且右孩子小于左孩子的值，则定位到右孩子
            if(childIndex+1<length&&arr[childIndex+1]<arr[childIndex]){
                childIndex++;
            }
            //如果父节点小于任何一个孩子的值，直接跳出
            if(tmp<=arr[childIndex]){
                break;
            }
            //无需真正交换，单向赋值即可
            arr[parentIndex]=arr[childIndex];
            parentIndex=childIndex;
            childIndex=2*childIndex+1;
        }
        arr[parentIndex]=tmp;
    }

    private static void buildHeap(int[] arr){
        for (int i =arr.length/2;i>=0;i--){
            downAdjust(arr,i,arr.length-1);
        }
    }
}
