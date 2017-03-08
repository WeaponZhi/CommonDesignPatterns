package TemplateMethod;

/**
 * ConcreteClassBaoCai 具体模板，手撕包菜
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/08 11:00 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class ConcreteClassBaoCai extends AbstractClass{
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    void pourSauce() {
        System.out.println("下个的酱料是辣椒");
    }
}
