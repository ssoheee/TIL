package com.example.p360;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    MyService ms;
    ProgressBar pb;
    SeekBar sb;

    ServiceConnection sc = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService.MyBinder mb = (MyService.MyBinder) iBinder;
            ms = mb.getService();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = findViewById(R.id.progressBar);
        sb = findViewById(R.id.seekBar);
        Intent i = new Intent(this, MyService.class);
        bindService(i, sc, Context.BIND_AUTO_CREATE);
        pb.setMax(30);
        sb.setMax(30);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        process(intent);
    }

    public void process(Intent intent){
        if (intent != null){
            int data = intent.getIntExtra("cmd",0);
            int data2 = intent.getIntExtra("cmd2",0);
            pb.setProgress(data);
            sb.setProgress(data2);
        }
    }

    public void bt1(View v){
        ms.bt1();
    }

    public void bt2(View v){
        ms.bt2();
    }
}
