package BuilderPattern;

/**
 * Director 建造过程
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 16:34 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class Director {

    public void Construct(Builder builder) {
        builder.BuildCPU()
                .BuildHD()
                .BuildMainboard();
    }
}
