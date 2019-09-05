package com.example.p247;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        Intent i = getIntent();
        int img = i.getIntExtra("img",0);

        textView.setText(img);
        imageView.setImageResource(img);

        name=textView.getText().toString();
        name = name.substring(13, name.length());
        textView.setText(name);

    }

    public void btclick(View v){
        finish();
    }
}
