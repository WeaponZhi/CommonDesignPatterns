package ObserverPattern;

/**
 * Observer 具体观察者
 * author:张冠之
 * time: 2017/4/17 10:50
 * e-mail: guanzhi.zhang@sojex.cn
 */

class Observer implements BaseObserver {
    //观察者的状态
    private String observerState;
    private BaseObservable mObservable;

    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("状态为：" + observerState);
    }

    @Override
    public void update(String state, BaseObservable observable) {
        observerState = state;
        mObservable = observable;
        System.out.println("状态为："+observerState);
        System.out.println("主题的HashCode为："+observable.hashCode());
    }
}
