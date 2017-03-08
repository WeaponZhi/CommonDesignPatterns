package FacadePattern;

/**
 * Facade 统一外观类，智能遥控器
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/08 11:11 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class Facade {
    SubSystemA_Light light;
    SubSystemB_Television television;
    SubSystemC_Aircondition aircondition;

    //传参
    public Facade(SubSystemA_Light light,SubSystemB_Television television,SubSystemC_Aircondition aircondition){
        this.light = light;
        this.television = television;
        this.aircondition = aircondition;
    }

    //起床后一键开电器
    public void on(){
        System.out.println("起床了");
        light.on();
        television.on();
        aircondition.on();
    }

    //睡觉时一键关电器
    public void off(){
        System.out.println("睡觉了");
        light.off();
        television.off();
        aircondition.off();
        System.out.println("可以睡觉了");
    }
}
