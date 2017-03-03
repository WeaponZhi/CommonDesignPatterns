package AdapterPattern;

/**
 * AdapterPattern 定义具体使用目标类，并通过Adapter类调用所需要的方法从而实现目标
 * 适配器模式的优点：
 * 更好的复用性；透明，简单；更好的扩展性；解耦性；符合开放-关闭原则
 * 缺点：
 * 过多的适配器会让系统零乱，不易整体进行把握
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/03 11:17 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class AdapterPattern {

    public static void main(String[] args) {

        Target mClassAdapter = new ClassAdapter();
        mClassAdapter.Request();
        //需要创建一个被适配类的对象作为参数
        Target mObjectAdapter = new ObjectAdapter(new Adaptee());
        mObjectAdapter.Request();
    }
}
