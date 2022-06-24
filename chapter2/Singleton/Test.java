package Singleton;

public class Test {

    public static void main(String[] args) {
        SingleThreadImpl a = SingleThreadImpl.getInstance();
        SingleThreadImpl b = SingleThreadImpl.getInstance();
        assert a == b;

        MultiThreadImpl c = MultiThreadImpl.getInstance();
        MultiThreadImpl d = MultiThreadImpl.getInstance();
        assert c == d;

        StaticInnerClassImpl i = StaticInnerClassImpl.getInstance();
        StaticInnerClassImpl j = StaticInnerClassImpl.getInstance();
        assert i == j;// compiler can deduce that always this assertion be true
    }
}
