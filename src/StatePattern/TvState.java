package StatePattern;

/**
 * TvState 电视操作接口
 * author:张冠之
 * time: 2017/4/17 14:22
 * e-mail: guanzhi.zhang@sojex.cn
 */

public interface TvState {
    void nextChannel();

    void prevChannel();

    void turnUp();

    void turnDown();
}
