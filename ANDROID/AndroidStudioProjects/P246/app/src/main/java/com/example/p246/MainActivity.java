package com.example.p246;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btclick(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("num", 500);
        intent.putExtra("str", "String");
        startActivity(intent);
}
}

