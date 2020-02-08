package sort;

/**
 * @author hhh
 * @date 2020/1/30 22:48
 * @Despriction 快速排序（填坑法）：平均时间复杂度为O(nlogn)，当pivot基准参数为数组最小值时，最差时间复杂度为O(n^2)
 *    选定基准参数，默认为数组第一个参数
 *    定义right与left （left  pivot  right，其中left<pivot<right）
 *    递归right与left
 *    不稳定排序
 *    使用分治法
 */
public class QuickSort {
  public static void main(String[] args) {
    int[] arr = new int[]{4, 7, 6, 5, 3, 2, 8, 1};
    //整个数组进行排序
    quickSort(arr,0,arr.length-1);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  /**
   *
   * @param arr 数组
   * @param startIndex 开始排序索引
   * @param endIndex 借宿排序索引
   */
  public static void quickSort(int[] arr, int startIndex, int endIndex) {
    // 递归结束条件：startIndex大等于endIndex的时候
    if (startIndex >= endIndex) {
      return;
    }
    // 得到基准元素位置
    int pivotIndex = partition(arr, startIndex, endIndex);
    // 用分治法递归数列的两部分
    quickSort(arr, startIndex, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, endIndex);
  }

  /**
   * 计算基准（pivot），最后返回的index，将数组进行分段，如下所示：
   * left  pivot  right
   * left < pivot < right
   * @param arr
   * @param startIndex
   * @param endIndex
   * @return
   */
  private static int partition(int[] arr, int startIndex, int endIndex) {
    // 取第一个位置的元素作为基准元素
    int pivot = arr[startIndex];
    int left = startIndex;
    int right = endIndex;
    // 坑的位置，初始等于pivot的位置
    int index = startIndex;
    //大循环在左右指针重合或者交错时结束
    while (right >= left) {
      //right指针从右向左进行比较
      while (right >= left) {
        if (arr[right] < pivot) {
          //将本次比较的元素放到坑的位置
          arr[left] = arr[right];
          //本次比较元素为新的坑
          index = right;
          //left 右移一位
          left++;
          break;
        }
        right--;
      }
      //left指针从左向右进行比较
      while (right >= left) {
        if (arr[left] > pivot) {
          arr[right] = arr[left];
          index = left;
          //right左移一位
          right--;
          break;
        }
        left++;
      }
    }
    arr[index] = pivot;
    return index;
  }
}
