package com.example.p284ws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textView2);
        Intent i = getIntent();
        String aa = i.getStringExtra("aa");
        textView.setText(aa);
    }

    public void bt(View view){
   Intent i = new Intent();
        switch(view.getId()){
            case R.id.button5:{
                i = new Intent(Main3Activity.this, Main2Activity.class);
                break;}
            case R.id.button6:{
                i = new Intent(Main3Activity.this, MainActivity.class);
                break;}
        }
        startActivity(i);
    }
}
