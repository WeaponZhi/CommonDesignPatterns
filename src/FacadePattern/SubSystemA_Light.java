package FacadePattern;

/**
 * SubSystemA_Light 电器类
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/08 11:08 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */
//灯类
public class SubSystemA_Light {

    public void on() {
        System.out.println("打开了灯...");
    }

    public void off() {
        System.out.println("关闭了灯...");
    }
}

//电视类
class SubSystemB_Television {
    public void on() {
        System.out.println("打开了电视...");
    }

    public void off() {
        System.out.println("关闭了电视...");
    }
}

//空调类
class SubSystemC_Aircondition {

    public void on() {
        System.out.println("打开了空调...");
    }

    public void off() {
        System.out.println("关闭了空调...");
    }
}