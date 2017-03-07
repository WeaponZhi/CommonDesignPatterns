package AbstractFactoryPattern;

/**
 * Factory
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 12:08 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public abstract class Factory {
    abstract AbstractProduct ManufactureContainer();

    abstract AbstractProduct ManufactureMould();
}
