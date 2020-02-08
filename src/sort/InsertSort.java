package sort;

/**
 * @author hhh
 * @date 2020/2/1 20:37
 * @Despriction 插入排序：扑克牌排序为例，将牌插入特定位置
 *  不稳定排序，会应为数字相等而改变原来数字位相邻置
 *  时间复杂度（O(n^2)），空间复杂度：O(1)（没有开辟新的空间）
 */
public class InsertSort {
  public static void main(String[] args) {
    int arr[]=new int[]{4,7,6,5,3,2,8,1};
    sort(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }
  private static void sort(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      int insertValue=arr[i];
      int j=i-1;
      for (; j>=0&&insertValue<arr[j]; j--) {
        arr[j+1]=arr[j];
      }
      arr[j+1]=insertValue;
    }
  }
}

