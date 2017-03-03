package Singleton;

/**
 * DoubleSynchronizedSingleton 双重校验锁解决单例模式的线程安全问题
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 10:29 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class DoubleSynchronizedSingleton {
    private static DoubleSynchronizedSingleton instance = null;
    private DoubleSynchronizedSingleton(){}

    public static DoubleSynchronizedSingleton newInstance(){
        //在Instance已经实例化的情况下，下次不必进行synchronized获取对象锁了
        if (instance == null){
            synchronized (DoubleSynchronizedSingleton.class){
                if (instance == null)
                    instance = new DoubleSynchronizedSingleton();
            }
        }
        return instance;
    }
}
