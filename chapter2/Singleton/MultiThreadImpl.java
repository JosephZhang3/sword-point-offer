package Singleton;

/**
 * 静态私有成员，懒加载，双重校验锁 + 内存可见 保证并发安全
 */
public class MultiThreadImpl {
    private static volatile MultiThreadImpl instance;

    private static final Object lock = new Object();

    public static MultiThreadImpl getInstance() {
        // 使用双重校验锁 Double Checked Lock时，被校验的对象应该是原子可见的（被 volatile 修饰）
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new MultiThreadImpl();
                }
            }
        }
        return instance;
    }
}