package TemplateMethod;

/**
 * TemplateMethod 模版方法模式
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/08 10:45 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class TemplateMethod {
    public static void main(String[] args) {
        //炒-手撕包菜
        ConcreteClassBaoCai concreteClassBaoCai = new ConcreteClassBaoCai();
        concreteClassBaoCai.cookProcess();
    }
}
