package com.example.calculator_tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Float Final_Value=0f;
    EditText Text_box;
    Float Last_Value=0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text_box= findViewById(R.id.Text_box);
    }

    public void Clear(View view){

        Final_Value=0f;
        Last_Value=null;
        Text_box.setText(null);


    }
    public void Result(View view){

        Text_box.setText(Final_Value.toString());

    }
    public void Value_typed(View view , int num){
        Final_Value+=num;

    }

}