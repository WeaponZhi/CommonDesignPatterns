package Singleton;

/**
 * InnerClassSingleton 通过静态内部类做到饿汉和懒汉的统一
 * 即做到了延时加载单例，又做到了线程安全
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 10:33 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class InnerClassSingleton {

    //在装载内部类的时候才会创建单例对象
    static class InnerSingleton {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton newInstance() {
        return InnerSingleton.instance;
    }
}
