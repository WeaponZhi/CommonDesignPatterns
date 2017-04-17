package ObserverPattern;

/**
 * ObserverPattern 具体使用
 * author:张冠之
 * time: 2017/4/17 10:51
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class ObserverPattern {
    public static void main(String[] args) {
        //创建主题对象
        Observable subject = new Observable();
        //创建观察者对象
        Observer observer = new Observer();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
        subject.changeWithObservable("new state with an Observable");
    }
}
