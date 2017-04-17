package StatePattern;

/**
 * Client 客户端使用者
 * author:张冠之
 * time: 2017/4/17 14:43
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();

        tvController.powerOff();
        //调高音量，此时不会生效
        tvController.turnUp();
    }
}
