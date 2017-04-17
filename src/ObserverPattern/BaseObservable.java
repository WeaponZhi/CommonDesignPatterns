package ObserverPattern;

/**
 * BaseObservable 抽象主题类，这里可以用抽象类减少具体主题类的代码量，但接口复用性更好
 * author:张冠之
 * time: 2017/4/17 10:51
 * e-mail: guanzhi.zhang@sojex.cn
 */

public interface BaseObservable {
    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    void attach(BaseObserver observer);

    /**
     * 删除观察者对象
     *
     * @param observer 观察者对象
     */
    void detach(BaseObserver observer);

    /**
     * 通知所有注册的观察者对象
     */
    void notifyObservers(String newState);

    /**
     * 通知观察者，并将自己传递给观察者，方便观察者进行一些处理
     * @param newState
     */
    void notifyByTellSelf(String newState);
}
