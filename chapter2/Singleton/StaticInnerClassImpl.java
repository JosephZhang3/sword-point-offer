package Singleton;

/**
 * 静态内部类
 */
public class StaticInnerClassImpl {

    private StaticInnerClassImpl(){
        System.out.println("called once");
    }

    static class InnerCla {
        private static StaticInnerClassImpl instance = new StaticInnerClassImpl();

        public StaticInnerClassImpl getInstance() {
            return instance;
        }
    }
}
