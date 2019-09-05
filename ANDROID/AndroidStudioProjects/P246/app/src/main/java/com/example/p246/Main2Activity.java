package com.example.p246;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        int a = intent.getIntExtra("num",0);
        String str = intent.getStringExtra("str");
        textView.setText(a+str);
    }

    public void btclick(View view){
        finish();
    }

    public void btclick2(View view){
        Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
        startActivityForResult(intent,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100 && resultCode==RESULT_OK){
            int nn =data.getIntExtra("nn", 0);
            String st = data.getStringExtra("st");
            textView2.setText(nn+st);
        }
    }
}
