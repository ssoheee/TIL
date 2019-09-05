package com.example.p247;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
    }

    public void btclick (View v){
        int id = v.getId();
        Intent i = new Intent (MainActivity.this, Main2Activity.class);

        switch(id) {
            case R.id.button:{
                i.putExtra("img", R.drawable.first);
                break;
            }

            case R.id.button2:{
                i.putExtra("img", R.drawable.second);
                break;
            }

            case R.id.button3:{
                i.putExtra("img", R.drawable.third);
                break;
            }
        }
        startActivity(i);
        }
    }
