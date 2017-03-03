package SimpleFactoryPattern;

/**
 * ProductA 创建具体产品类（继承抽象产品类），定义生产的具体产品
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 15:19 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class ProductA extends Product{

    @Override
    void show() {
        System.out.println("生产出了产品A");
    }
}
class ProductB extends Product{

    @Override
    void show() {
        System.out.println("生产出了产品B");
    }
}

class ProductC extends Product{

    @Override
    void show() {
        System.out.println("生产出了产品C");
    }
}
