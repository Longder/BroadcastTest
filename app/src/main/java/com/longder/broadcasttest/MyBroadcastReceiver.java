package com.longder.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Longder on 2016/5/17.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "自定义接收器接收到消息", Toast.LENGTH_LONG).show();
        //截断广播
        abortBroadcast();
    }
}
