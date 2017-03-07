package BuilderPattern;

/**
 * BuilderPattern 建造者模式
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 16:30 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.Construct(builder);
        Computer computer = builder.GetComputer();
        computer.Show();
    }
}
