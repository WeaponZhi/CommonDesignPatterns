package ProxyPattern;

/**
 * ProxyPattern 客户端调用，完全隐藏了具体目标对象的逻辑实现
 * 代理模式的主要作用：起到中介作用，连接客户端和目标对象
 * 解决的问题：防止直接访问目标对象给系统造成的不必要复杂性
 * 优点：降低耦合度；代理对象作为中介，保护了目标对象
 * 缺点：因为多了中介，所以请求速度会变慢；复杂度增加
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 10:48 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class ProxyPattern {

    public static void main(String[] args) {

        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
