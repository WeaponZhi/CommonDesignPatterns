package AbstractFactoryPattern;

/**
 * FactoryA 具体工厂类
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 12:13 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

class FactoryA extends Factory{

    @Override
    AbstractProduct ManufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    AbstractProduct ManufactureMould() {
        return new MouldProductA();
    }
}

class FactoryB extends Factory{

    @Override
    AbstractProduct ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    AbstractProduct ManufactureMould() {
        return new MouldProductB();
    }
}
