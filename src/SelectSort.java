/**
 * @author hhh
 * @date 2020/2/1 20:11
 * @Despricti 选择排序:选择最小的数字将其放入数组第一个位置。时间复杂度：O(n^2)，空间复杂度：O(1)
 */
public class SelectSort {
  public static void main(String[] args) {
    int arr[]=new int[]{4,7,6,5,2,3,8,1};
    sort(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }
  private static void sort(int arr[]){
    int minIndex=0;
    int tmp = 0;
    for (int i = 0; i < arr.length; i++) {
      minIndex = i;
      for (int j = i+1; j < arr.length; j++) {
        minIndex=arr[j]<arr[minIndex]?j:minIndex;
      }
      tmp = arr[i];
      arr[i]=arr[minIndex];
      arr[minIndex]=tmp;
    }
  }
}
