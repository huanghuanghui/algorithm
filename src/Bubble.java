/**
 * @author hhh
 * @date 2020/1/30 20:44
 * @Despriction 暂时最优的的冒泡排序，三个重要变量。时间复杂度：O(n^2)，空间复杂度：O(1)
 *    稳定排序，不会应为数字相等而改变原来数字相邻位置
 *    1、本次轮询是否有进行元素位置交换
 *    2、元素交换边界，为上次轮询后，最后一个元素的交换位置，本元素以后的数据为有序
 *    3、本次轮询最后一个元素交换位置
 */
public class Bubble {
  public static void main(String[] args) {
    int[] arr = new int[]{7, 1, 4, 6, 0, 9, 3, 2, 5, 8};
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private static void sort(int[] arr) {
    //临时变量
    int tmp = 0;
    //最后一次元素交换位置
    int endExchange = 0;
    //交换边界，边界之后的数据为有序
    int sortBorder = arr.length - 1;
    //本次轮询是否有进行元素交换，若没有元素交换，则数组已经为有序，退出循环
    boolean isSort = true;
    for (int i = 0; i < arr.length; i++) {
      isSort = false;
      for (int j = 0; j < sortBorder; j++) {
        if (arr[j] > arr[j + 1]) {
          tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
          endExchange = j;
          isSort = true;
        }
      }
      //未进行排序，直接退出轮询
      if (!isSort) {
        break;
      }
      //每次轮询更新有序边界
      sortBorder = endExchange;
    }
  }
}
