package FacadePattern;

/**
 * FacadePattern 外观模式，客户端调用
 * 爷爷使用智能遥控器的时候
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/08 11:07 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class FacadePattern {
    public static void main(String[] args) {
        //实例化电器类
        SubSystemA_Light light = new SubSystemA_Light();
        SubSystemB_Television television = new SubSystemB_Television();
        SubSystemC_Aircondition aircondition = new SubSystemC_Aircondition();

        //传参
        Facade facade = new Facade(light, television, aircondition);

        //客户端直接与外观对象进行交互
        facade.on();
        System.out.println("可以看电视了");
        facade.off();
        System.out.println("可以睡觉了");
    }
}
