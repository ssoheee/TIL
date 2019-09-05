package com.example.p353;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent i;
    TextView tv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        iv = findViewById(R.id.imageView);
    }

    public void bt (View v){
        i = new Intent(MainActivity.this, MyService.class);
        startService(i);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(i != null){
            stopService(i);
            Log.d("[My Service]", "Stop~~");
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        process(intent);
    }

    public void process(Intent intent){
        if (intent != null){
            int data = intent.getIntExtra("cmd",0);
            tv.setText(""+data);
        }
    }
}
