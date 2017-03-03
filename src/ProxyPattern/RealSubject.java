package ProxyPattern;

/**
 * RealSubject  创建真实对象类（RealSubject）,即”我“
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 10:45 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class RealSubject implements Subject{

    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}
