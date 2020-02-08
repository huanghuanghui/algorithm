package generic;

import java.security.PrivateKey;

/**
 * @auther hhh
 * @date 2020/2/8 15:14
 * @description
 */
public class GenericServiceImpl<T> implements GenericService<T> {

    @Override
    public T getDate(T date) {
        return date;
    }

    public static void main(String[] args) {
        GenericServiceImpl genericService = new GenericServiceImpl();
        System.out.println(genericService.getDate("hello world"));
    }
}
