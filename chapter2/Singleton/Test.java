package Singleton;

public class Test {

    public static void main(String[] args) {
        // use static field to implement
        SingleThreadImpl a = SingleThreadImpl.getInstance();
        SingleThreadImpl b = SingleThreadImpl.getInstance();
        assert a == b;

        // use 'Double Checked Lock' to implement Thread-safe
        MultiThreadImpl c = MultiThreadImpl.getInstance();
        MultiThreadImpl d = MultiThreadImpl.getInstance();
        assert c == d;

        // user 'static inner class' to implement.Best solution!
        StaticInnerClassImpl.InnerCla inI = new StaticInnerClassImpl.InnerCla();
        StaticInnerClassImpl i = inI.getInstance();
        StaticInnerClassImpl.InnerCla inJ = new StaticInnerClassImpl.InnerCla();
        StaticInnerClassImpl j = inJ.getInstance();
        assert i == j;
    }
}
