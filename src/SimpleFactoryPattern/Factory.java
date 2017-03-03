package SimpleFactoryPattern;

/**
 * Factory 创建工厂类，通过创建静态方法从而根据传入不同参数创建不同具体产品类的实例
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 15:21 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class Factory {

    public static Product Manufacture(String ProductName) {
        //工厂类里用switch语句控制生产哪种商品；
        //使用者只需要调用工厂类的静态方法就可以实现产品类的实例化。
        switch (ProductName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            case "C":
                return new ProductC();
            default:
                return null;
        }
    }
}
