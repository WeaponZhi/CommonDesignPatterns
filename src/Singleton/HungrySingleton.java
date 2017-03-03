package Singleton;

/**
 * HungrySingleton 单例模式 饿汉式 自动进行单例初始化，线程安全
 * 应用场景：
 * 直接在应用启动时加载并初始化
 * 单例对象要求初始化速度非常快且占用内存非常小
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 09:57 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class HungrySingleton {
    //1. 创建私有变量 ourInstance（用以记录 HungrySingleton 的唯一实例）
    //2. 内部进行实例化
    private static HungrySingleton ourInstance  = new HungrySingleton();
    //3. 把类的构造方法私有化，不让外部调用构造方法实例化
    private HungrySingleton() {
    }
    //4. 定义公有方法提供该类的全局唯一访问点
    //5. 外部通过调用getInstance()方法来返回唯一的实例
    public static HungrySingleton newInstance() {
        return ourInstance;
    }
}
