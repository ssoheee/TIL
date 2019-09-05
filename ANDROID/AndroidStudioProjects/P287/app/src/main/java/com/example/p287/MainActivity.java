package com.example.p287;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View1Fragment v1;
    View2Fragment v2;
    View3Fragment v3;
    Button bt, bt2, bt3;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       v1 = (View1Fragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        // v1 = new View1Fragment(); // new로 생성하면 메인액티비티가 컨트롤 못함
        v2 = new View2Fragment();
        v3 = new View3Fragment();
        tv = findViewById(R.id.textView);
    }

    public void btc(){
        Log.i("h","log");
    }

    public void bt (View v) {
        if (v.getId()==R.id.button){
            onFragmentChange(1);

        }
        else if (v.getId()==R.id.button2){
            onFragmentChange (2);
        }
        else if (v.getId()==R.id.button3){
            onFragmentChange (3);
        }
    }



    public void onFragmentChange (int index){
        if (index==1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,v1).commit();
            v1.sett();
        }
        else if (index==2){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,v2).commit();
        }
        else if (index==3){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,v3).commit();
        }
    }



}
