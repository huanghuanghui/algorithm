package sort;

/**
 * @auther hhh
 * @date 2020/2/5 17:00
 * @description
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println(handle(10));
    }
    private  static int handle(int n){
        try {
            n+=1;
            int b = 0;
            if (n/b>0){
                n+=1;
            }else{
                n-=10;
            }
            return n;
        }catch (Exception e){
            n++;
        }
        n++;
        return n++;
    }
}
