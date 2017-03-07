package FactoryPattern;

/**
 * Product 创建抽象产品类 ，定义具体产品的公共接口
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 10:31 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

abstract class Product {
    public abstract void Show();
}

//具体产品A类
class ProductA extends Product {
    @Override
    public void Show() {
        System.out.println("生产出了产品A");
    }
}

//具体产品B类
class ProductB extends Product {

    @Override
    public void Show() {
        System.out.println("生产出了产品B");
    }
}
