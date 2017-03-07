package StrategyPattern;

/**
 * StrategyPattern 策略模式
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 16:13 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class StrategyPattern {
    public static void main(String[] args) {

        SalesMan mSalesMan;

        //春节来了，使用春节促销活动
        System.out.println("对于春节：");
        mSalesMan = new SalesMan("A");
        mSalesMan.SalesManShow();


        //中秋节来了，使用中秋节促销活动
        System.out.println("对于中秋节：");
        mSalesMan = new SalesMan("B");
        mSalesMan.SalesManShow();

        //圣诞节来了，使用圣诞节促销活动
        System.out.println("对于圣诞节：");
        mSalesMan = new SalesMan("C");
        mSalesMan.SalesManShow();
    }
}
