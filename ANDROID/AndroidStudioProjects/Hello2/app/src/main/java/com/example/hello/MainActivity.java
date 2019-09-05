package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Paused", Toast.LENGTH_LONG).show();
    }

    public void clickbutton(View view){
        Toast.makeText(this, "click button", Toast.LENGTH_SHORT).show();
        Log.d("[Debug]","Ok");
        Log.i("[Info]","Info");
        Log.e("[Error]","Error");
    }


}
