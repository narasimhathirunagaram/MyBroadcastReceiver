package com.example.mybroadcatreceivers;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String CUSTOM_BROADCAST="com.example.mybroadcatreceivers.CUSTOM_BROADCAST";
   MyBroadcastReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiver=new MyBroadcastReceiver();
        LocalBroadcastManager.getInstance(this).registerReceiver(receiver,new IntentFilter(CUSTOM_BROADCAST));
    }

    public void sendMyCustomBroadcastMesaage(View view) {
        Intent intent=new Intent(CUSTOM_BROADCAST);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public void displayHello(View view) {
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
    }
}
