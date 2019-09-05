package com.example.p284ws;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String userid = "sohee";
    String userpwd = "1111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt(View view){
        EditText id = (EditText) findViewById(R.id.editText);;
        EditText p = (EditText) findViewById(R.id.editText2);
        String idc = id.getText().toString();
        String pc = p.getText().toString();
        if (idc.equals(userid) && pc.equals(userpwd)){
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }

        else {
            AlertDialog.Builder a = new AlertDialog.Builder(this);
            a.setTitle("잘못된 정보");
            a.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    return;
                }
            });
            a.show();
        }
    }
}
