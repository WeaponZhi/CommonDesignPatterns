package AdapterPattern;

/**
 * ObjectAdapter 对象的适配器模式
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 11:31 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class ObjectAdapter implements Target {
    //直接关联被适配类
    private Adaptee adaptee;

    //通过构造方法传入具体需要适配的被适配对象
    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void Request() {
        //这里使用委托的方式完成特殊功能
        this.adaptee.SpecificRequest();
    }
}
