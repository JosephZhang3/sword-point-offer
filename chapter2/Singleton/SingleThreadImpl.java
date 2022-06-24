package Singleton;

/**
 * 静态私有成员，懒加载
 */
public class SingleThreadImpl {
    private static SingleThreadImpl instance;

    public static SingleThreadImpl getInstance() {
        if (instance == null) {
            instance = new SingleThreadImpl();
        }
        return instance;
    }
}