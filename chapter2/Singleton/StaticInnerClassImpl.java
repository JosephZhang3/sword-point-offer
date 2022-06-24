package Singleton;

/**
 * 静态内部类
 */
public class StaticInnerClassImpl {

    public static StaticInnerClassImpl getInstance() {
        return InnerC.instance;
    }

    private static class InnerC {
        private static final StaticInnerClassImpl instance = new StaticInnerClassImpl();
    }
}
