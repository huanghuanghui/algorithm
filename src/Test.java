/**
 * @author hhh
 * @date 2020/1/30 21:19
 * @Despriction
 */
public class Test {
  public static void main(String[] args) {
    int[] arr = new int[]{7, 1, 4, 6, 0, 9, 3, 2, 5, 8};
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private static void sort(int arr[]) {
    int tmp = 0;
    int endChage=0;
    int sortBorder=arr.length-1;
    boolean isSort=true;
    for (int i = 0; i < arr.length; i++) {
      isSort=false;
      for (int j = 0; j < sortBorder; j++) {
        if (arr[j]>arr[j+1]){
          tmp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=tmp;
          isSort=true;
          endChage=j;
        }
      }
      if (!isSort){
        break;
      }
      sortBorder=endChage;
    }
  }
}
