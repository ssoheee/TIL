package com.example.p284ws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void bt(View view){
        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
        switch(view.getId()){
            case R.id.button2:{
                i.putExtra("aa", "고객 관리");
            break;}
            case R.id.button3:{
                i.putExtra("aa", "매출 관리");
                break;}
            case R.id.button4:{
                i.putExtra("aa", "상품 관리");
                break;}
        }
        startActivity(i);
    }
}
