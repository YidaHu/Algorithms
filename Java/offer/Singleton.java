package offer;

/**
 * @program: Java
 * @description: 单例模式
 * @author: huyida
 * @create: 2019-02-06 17:31
 **/

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {

    }

    public static synchronized Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
