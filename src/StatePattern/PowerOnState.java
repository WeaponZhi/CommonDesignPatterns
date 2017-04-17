package StatePattern;

/**
 * PowerOnState 电视打开状态的操作
 * author:张冠之
 * time: 2017/4/17 14:23
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
