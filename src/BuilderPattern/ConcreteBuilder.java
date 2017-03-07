package BuilderPattern;

/**
 * ConcreteBuilder 具体建造者
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 16:36 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class ConcreteBuilder extends Builder {
    Computer computer = new Computer();

    @Override
    Builder BuildCPU() {
        computer.Add("加装CPU");
        return this;
    }

    @Override
    Builder BuildMainboard() {
        computer.Add("加装主板");
        return this;
    }

    @Override
    Builder BuildHD() {
        computer.Add("加装硬盘");
        return this;
    }

    @Override
    Computer GetComputer() {
        return computer;
    }
}
