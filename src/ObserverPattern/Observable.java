package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable 具体主题角色类
 * author:张冠之
 * time: 2017/4/17 10:50 
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class Observable implements BaseObservable {
    //用来保存注册的观察者对象
    private List<BaseObserver> list = new ArrayList<>();
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为：" + state);
        //状态发生改变，通知各个观察者
        this.notifyObservers(state);
    }

    public void changeWithObservable(String newState){
        state = newState;
        System.out.println("主题状态为："+state);
        this.notifyByTellSelf(state);
    }

    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    public void attach(BaseObserver observer) {
        if (!list.contains(observer)) {
            list.add(observer);
            System.out.println("Attached an observer");
        }
    }

    /**
     * 删除观察者对象
     *
     * @param observer 观察者对象
     */
    public void detach(BaseObserver observer) {

        list.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void notifyObservers(String newState) {

        for (BaseObserver observer : list) {
            observer.update(newState);
        }
    }

    @Override
    public void notifyByTellSelf(String newState) {
        for (BaseObserver observer : list){
            observer.update(newState, this);
        }
    }

}
