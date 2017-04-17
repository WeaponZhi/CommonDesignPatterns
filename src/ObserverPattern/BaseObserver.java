package ObserverPattern;

/**
 * BaseObserver 观察者接口
 * author:张冠之
 * time: 2017/4/17 10:51
 * e-mail: guanzhi.zhang@sojex.cn
 */

public interface BaseObserver {
    /**
     * 更新接口
     *
     * @param state 更新的状态
     */
    void update(String state);

    void update(String state,BaseObservable observable);
}
