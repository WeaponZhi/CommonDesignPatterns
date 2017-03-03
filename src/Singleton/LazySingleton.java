package Singleton;

/**
 * LazySingleton 懒汉式，有需要的时候才手动调用newInstance()进行单例的初始化操作
 * 应用场景：
 * 单例初始化的操作耗时比较长而且应用对于启动速度又有要求
 * 单例的占用内存较大
 * 单例只在某个特定场景的情况下才会被使用，即按需延迟加载单例
 *
 * 懒汉不是线程安全的
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 10:17 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton newInstance(){
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
