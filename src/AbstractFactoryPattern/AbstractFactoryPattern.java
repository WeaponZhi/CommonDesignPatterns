package AbstractFactoryPattern;

/**
 * AbstractFactoryPattern 定义工厂的公共接口
 * 优点：耦合降低
 * 缺点：新品种变化的时候，需要改变通用接口，从而所有的子类都要去改变
 *
 * 应用场景：
 * 一个系统不要求依赖产品类实例如何被创建、组合和表达的表达，这点也是所有工厂模式应用的前提。
 * 这个系统有多个系列产品，而系统中只消费其中某一系列产品
 * 系统要求提供一个产品类的库，所有产品以同样的接口出现，客户端不需要依赖具体实现。
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 12:08 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        FactoryB factoryB = new FactoryB();
        //A工厂需要容器A和模具A
        factoryA.ManufactureContainer().show();
        factoryA.ManufactureMould().show();
        //B工厂需要容器B和模具B
        factoryB.ManufactureContainer().show();
        factoryB.ManufactureMould().show();
    }
}
