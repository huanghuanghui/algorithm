package sort;

/**
 * @author hhh
 * @date 2020/2/1 20:45
 * @Despriction 单例模式：分为饿汉与懒汉
 */
public class Singleton {
  //私有化构造，不让类以外创建Singleton的实例，无参构造的作用是用于子类的初始化，若不提供构造，类加载的时候
  //JVM 会默认提供，若提供了有参构造，且有子类继承本类，必须提供无参构造，不然子类无法进行初始化
  private Singleton() {
  }
  //饿汉式，类被加载的时候就会进行初始化
  private static final Singleton hungryInstance=new Singleton();
  //使用volatile关键字，阻止JVM编译器的指令重排
  private volatile static Singleton lazyInstance=null;

  public static Singleton getHungryInstance(){
    return hungryInstance;
  }
  public static Singleton getLazyInstance(){
    //双重检查机制，防止多线程时，lazyInstance进行实例创建
    if (lazyInstance==null){
      //同步锁，对整个类进行加锁
      synchronized (Singleton.class){
        //双重检查机制，防止多线程时，lazyInstance进行实例创建
        if (lazyInstance==null){
          lazyInstance=new Singleton();
        }
      }
    }
    return lazyInstance;
  }

  public static void main(String[] args) {
    System.out.println(getHungryInstance());
    System.out.println(getLazyInstance());

    System.out.println(getHungryInstance()==getHungryInstance());
    System.out.println(getLazyInstance()==getLazyInstance());
  }
}
