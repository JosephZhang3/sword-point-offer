package Singleton;

/**
 * 静态内部类
 */
public class StaticInnerClassImpl {

    private StaticInnerClassImpl(){
        System.out.println("called once");
    }

    static class InnerCla {
        // Do not declare as final, because you may use the field later.
        private static StaticInnerClassImpl instance = new StaticInnerClassImpl();

        public StaticInnerClassImpl getInstance() {
            return instance;
        }
    }
}
