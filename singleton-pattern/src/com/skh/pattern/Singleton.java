package com.skh.pattern;

/**
 * Created by User: skh.
 * Date: 2018/7/19 Time: 10:29.
 * Description:
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    // 懒汉式单例，线程不安全
    /**
     * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程
     * 不要求线程安全，在多线程不能正常工作
     */
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    /**
     * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
     * 加锁会影响效率
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     *双检锁/双重校验锁（DCL，即 double-checked locking）
     * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能
     */
//    private volatile static Singleton singleton;
//    private Singleton() {}
//    public static Singleton getSingleton() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }


    /**
     * 静态内部类
     * 这种方式能达到双检锁方式一样的功效，但实现更简单。
     * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用
     *
     * 这种方式同样利用了 classloader 机制来保证初始化 instance 时只有一个线程，
     * 它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），
     * 而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，
     * 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
     * 想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，
     * 因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。
     * 这个时候，这种方式相比第 3 种方式就显得很合理。
     */
//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    private Singleton (){}
//    public static final Singleton getInstance() {
//        return SingletonHolder.INSTANCE;
//    }
}
