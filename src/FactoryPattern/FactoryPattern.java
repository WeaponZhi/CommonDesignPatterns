package FactoryPattern;

/**
 * FactoryPattern 外界通过调用具体工厂类的方法，从而创建不同具体产品类的实例
 * 优点：新增一种产品时，只需要增加相应的具体产品和相应的工厂子类即可
 *      符合单一职责原则：每个具体工厂类只负责创建对应的产品
 *      不使用静态工厂方法，可以形成基于继承的等级结构。
 * 缺点：有一定复杂度，系统开销有一定增加
 *      增大了理解难度，增加了系统实现难度
 *      一个工厂只能创建一种具体产品
 *      虽然保证了工厂方法内的对修改关闭，但对于使用工厂方法的类，
 *      如果要更换另外一种产品，仍然需要修改实例化的具体工厂类；
 *
 * 应用场景：
 * 当一个类不知道它所需要的对象的类时
 * 当一个类希望通过其子类来指定创建对象时
 * 将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无须关心
 * 是哪一个工厂子类创建产品子类，需要时再动态指定，可将具体工厂类的类名存储
 * 在配置文件或者数据库中
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 10:30 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class FactoryPattern {
    public static void main(String[] args) {
        //客户要产品A
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().Show();
        //客户要产品B
        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().Show();
    }
}
