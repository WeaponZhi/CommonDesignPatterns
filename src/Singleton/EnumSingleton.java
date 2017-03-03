package Singleton;

/**
 * EnumSingleton 枚举类型是最简洁，易用的单例实现方式
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 10:36 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public enum  EnumSingleton {
    /**
     * 使用方法：
     * EnumSingleton instance = EnumSingleton.instance;
     * instance.doSomething();
     */
    //定义一个枚举元素，它就是一个EnumSingleton的一个实例
    instance;
    public void doSomething(){

    }
}
