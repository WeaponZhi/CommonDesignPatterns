package AbstractFactoryPattern;

/**
 * ContainerProductA 具体产品类族
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 12:12 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */
//容器产品A类
class ContainerProductA extends ContainerProduct {

    @Override
    void show() {
        System.out.println("生产出了容器产品A");
    }
}

//容器产品B类
class ContainerProductB extends ContainerProduct {
    @Override
    public void show() {
        System.out.println("生产出了容器产品B");
    }
}

//模具产品A类
class MouldProductA extends MouldProduct {

    @Override
    public void show() {
        System.out.println("生产出了模具产品A");
    }
}

//模具产品B类
class MouldProductB extends MouldProduct {

    @Override
    public void show() {
        System.out.println("生产出了模具产品B");
    }
}