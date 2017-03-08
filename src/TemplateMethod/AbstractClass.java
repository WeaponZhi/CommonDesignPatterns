package TemplateMethod;

/**
 * AbstractClass 创建抽象模板结构：炒菜的步骤
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/08 10:47 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public abstract class AbstractClass {
    //模板方法，用来控制炒菜的流程（炒菜的）,流程一样，复用
    //申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
    final void cookProcess() {
        this.pourOil();
        this.HeatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }
    //定义结构里哪些方法是都一样的可复用的，哪些需要子类进行实现的

    //倒油都一样
    void pourOil() {
        System.out.println("倒油");
    }

    //热油一样
    void HeatOil() {
        System.out.println("热油");
    }

    //放蔬菜不一样
    abstract void pourVegetable();

    //放调料不一样
    abstract void pourSauce();

    //翻炒都一样
    void fry() {
        System.out.println("炒啊炒啊炒到熟");
    }
}
