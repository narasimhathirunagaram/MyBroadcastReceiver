package com.example.mybroadcatreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
        String action=intent.getAction();
        switch (action){
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "ACTION_AIRPLANE_MODE_CHANGED", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context, "ACTION_POWER_CONNECTED", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "ACTION_POWER_DISCONNECTED", Toast.LENGTH_SHORT).show();
                break;
                default:
                    Toast.makeText(context, "custom broadcast", Toast.LENGTH_SHORT).show();
                    break;
        }
    }
}
