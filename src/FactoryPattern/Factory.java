package FactoryPattern;

/**
 * Factory 创建抽象工厂类，定义具体工厂的公共接口
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 10:30 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

abstract class Factory {
     abstract Product Manufacture();
}
//具体产品A
class FactoryA extends Factory{

    @Override
    Product Manufacture() {
        return new ProductA();
    }
}

//具体产品B
class FactoryB extends Factory{

    @Override
    Product Manufacture() {
        return new ProductB();
    }
}
