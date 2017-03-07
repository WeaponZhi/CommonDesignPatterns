package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Computer 电脑
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/07 16:33 <br>
 * e-mail: 584098488@qq.com <br>
 * </p>
 */

public class Computer {
    //电脑组件的集合
    private List<String> parts = new ArrayList<>();

    //用于将组件组装到电脑里
    public void Add(String part) {
        parts.add(part);
    }

    public void Show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("组件" + parts.get(i) + "装好了");
        }
        System.out.println("电脑组装完成，请验收");


    }
}
