/**
 * @author hhh
 * @date 2020/1/30 21:19
 * @Despriction
 */
public class Test {
  public static void main(String[] args) {
    int[] arr = new int[]{4, 7, 6, 5, 3, 2, 8, 1};
    //quickSort(arr,0,arr.length-1);
    bSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private static void bubbleSore(int arr[]) {
    int tmp = 0;
    int endChage = 0;
    int sortBorder = arr.length - 1;
    boolean isSort = true;
    for (int i = 0; i < arr.length; i++) {
      isSort = false;
      for (int j = 0; j < sortBorder; j++) {
        if (arr[j] > arr[j + 1]) {
          tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
          isSort = true;
          endChage = j;
        }
      }
      if (!isSort) {
        break;
      }
      sortBorder = endChage;
    }
  }

  private static void quickSort(int arr[], int startIndex, int endIndex) {
    if (arr.length == 0) {
      return;
    }
    if (startIndex >= endIndex) {
      return;
    }
    int partition = partition(arr,startIndex,endIndex);
    quickSort(arr,0,partition-1);
    quickSort(arr,partition+1,endIndex-1);
  }

  private static int partition(int arr[], int startIndex, int endIndex) {
    //默认基准为数组第一个数
    int pivot = arr[0];
    //确认坑的位置
    int index = 0;
    int left = 0;
    int right = arr.length - 1;
    //最外层轮询，直到left，right重合或者right<left 的时候退出
    while (right >= left) {
      //先从right进行比较，
      while (right >= left) {
        if (arr[right] < pivot) {
          arr[left] = arr[right];
          index = right;
          left++;
          break;
        }
        right--;
      }
      while (right >= left) {
        if (arr[left] > pivot) {
          arr[right]=arr[left];
          index=left;
          right--;
          break;
        }
        left++;
      }
    }
    arr[index]=pivot;
    return index;
  }

  private static void  bSort(int arr[]){
    int tmp=0;
    int endChange=0;
    int sortBorder=arr.length-1;
    boolean isSort=true;
    for (int i = 0; i < arr.length; i++) {
      isSort=false;
      for (int j = 0; j < sortBorder; j++) {
        if (arr[j]<arr[j+1]){
          tmp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=tmp;
          isSort=true;
          endChange=j;
        }
        if (!isSort){
          break;
        }
        sortBorder=endChange;
      }
    }
  }
}
