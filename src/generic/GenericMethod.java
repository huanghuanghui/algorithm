package generic;

/**
 * @auther hhh
 * @date 2020/2/8 15:10
 * @description
 */
public class GenericMethod<T> {
    private T date;

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.setDate("Hello World");
        System.out.println(genericMethod.getDate());
    }
}
