package ProxyPattern;

/**
 * Proxy 创建代理对象类（Proxy），即”代购“，并通过代理类创建真实对象实例并访问其方法
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 10:46 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class Proxy implements Subject{
    @Override
    public void buyMac() {

        //引用并创建真实对象实例，即“我”
        RealSubject realSubject = new RealSubject();

        //调用真实对象的方法，进行代理购买
        realSubject.buyMac();
        //代理的额外操作
        this.WrapMac();
    }

    private void WrapMac() {
        System.out.println("用盒子包好Mac");
    }
}
