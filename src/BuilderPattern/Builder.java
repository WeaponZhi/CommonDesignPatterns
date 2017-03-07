package BuilderPattern;

/**
 * Builder 建造抽象类：组装电脑的过程
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 16:31 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public abstract class Builder {
    //第一步：装CPU
    //声明为抽象方法，具体由子类实现
    abstract Builder BuildCPU();
    //第二步：装主板
    abstract Builder BuildMainboard();
    //第三步：装硬盘
    abstract Builder BuildHD();
    //返回产品的方法：获得组装好的电脑
    abstract Computer GetComputer();
}
