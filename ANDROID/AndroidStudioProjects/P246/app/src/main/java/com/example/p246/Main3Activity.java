package com.example.p246;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void clickBt (View view){
        Intent intent = new Intent();
        intent.putExtra("st","HI");
        intent.putExtra("nn", 500);
        setResult(RESULT_OK, intent);
        finish();
    }
}
