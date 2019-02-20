package com.hxzk.bj.sameprocessmodule.action;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.hxzk.bj.sameprocessmodule.SamePrecessActivity;
import com.xzt.xrouter.router.Xaction;

import java.util.HashMap;

/**
 * 作者：created by ${zjt} on 2019/2/19
 * 描述:
 */
public class SameProcessAction extends Xaction {
    @Override
    public Object startAction(Context context, HashMap<String, Object> hashMap) {
        if(context instanceof Activity){//传入的是Activity的上下文
            Intent i = new Intent(context,SamePrecessActivity.class);
            i.putExtra("data",hashMap.get("data").toString());
            context.startActivity(i);
        }else{//如果传入的是Application的上下文
            Intent i = new Intent(context, SamePrecessActivity.class);
            i.putExtra("data",hashMap.get("data").toString());
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
        return "成功发送数据到同进程moudle";
    }

}
