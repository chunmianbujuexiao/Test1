package com.example.myapplication;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2017/4/13.
 */
public class BroadcastReceiverLock extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("HHHHHHHHHHHHHHHH","HHHHHHHHHHHHHHHHH");
        Intent i = new Intent(context,ActivityLock.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
//        KeyguardManager km = (KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE);
//        if (km.inKeyguardRestrictedInputMode()) {
//            Intent i = new Intent(context,ActivityLock.class);
//            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(i);
//        }

    }
}
