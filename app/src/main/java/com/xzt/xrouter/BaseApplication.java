package com.xzt.xrouter;

import android.app.Application;

import com.hxzk.bj.common.DifferentProcessActionMessage;
import com.hxzk.bj.common.SameProcessActionMessage;
import com.xzt.xrouter.router.Xrouter;


/**
 * 作者：created by ${zjt} on 2019/2/19
 * 描述:
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //通道的初始化最好放在Application中
        initAction();
    }

        private void initAction() {
            Xrouter.getInstance().registerAction(DifferentProcessActionMessage.DIFFERENTPROCESSACTIONNAME,new com.hxzk.bj.differnertprocess.action.DifferentProcessAction());
           Xrouter.getInstance().registerAction(SameProcessActionMessage.SANEPORICESSBANE,new com.hxzk.bj.sameprocessmodule.action.SameProcessAction());
    }

}
