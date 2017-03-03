package SimpleFactoryPattern;

/**
 * SimpleFactoryPattern 外界通过调用工厂类的静态方法，传入不同参数从而创建不同具体产品类的实例
 * 简单工厂模式的优点：
 * 创建实例的工作与使用实例的工作分离开，使用者不必关心类对象如何创建，实现了解耦
 * 把初始化实例时的工作放在工厂里进行，使代码更容易维护。符合面向对象和面向接口编程
 * 缺点：
 * 工厂如果不能工作，整个系统就会受到影响
 * 添加新产品需要修改工厂类逻辑
 * 静态工厂方法不能被重写和继承，会造成工厂角色无法形成基于继承的等级结构
 *
 * 应用场景：
 * 客户只知道传入工厂类的参数，对于如何创建对象的逻辑不关心
 * 当工厂类负责创建的对象（具体产品）比较少的时候
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 15:24 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class SimpleFactoryPattern {

    public static void main(String[] args) {
        Factory factory = new Factory();
        //客户要产品A
        try {
        //调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            factory.Manufacture("A").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }

        //客户要产品B
        try {
            factory.Manufacture("B").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }

        //客户要产品C
        try {
            factory.Manufacture("C").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }

        //客户要产品D
        try {
            factory.Manufacture("D").show();
        } catch (NullPointerException e) {
            System.out.println("没有这一类产品");
        }
    }
}
