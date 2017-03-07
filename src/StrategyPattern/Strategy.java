package StrategyPattern;

/**
 * Strategy 定义抽象策略角色（Strategy）：百货公司所有促销活动的共同接口
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 16:14 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public abstract class Strategy {
    abstract void show();
}

/**
 * 定义具体策略角色（Concrete Strategy）：每个节日具体的促销活动
 */
//为春节准备的促销活动A
class StrategyA extends Strategy{

    @Override
    public void show() {
        System.out.println("为春节准备的促销活动A");
    }
}

//为中秋节准备的促销活动B
class StrategyB extends Strategy{

    @Override
    public void show() {
        System.out.println("为中秋节准备的促销活动B");
    }
}

//为圣诞节准备的促销活动C
class StrategyC extends Strategy{

    @Override
    public void show() {
        System.out.println("为圣诞节准备的促销活动C");
    }
}
