package com.example.calculator_tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Float Final_Value=0f;
    TextView Text_box;
    Float Last_Value=0f;
    String Text_box_text="";
    Character type_operation=' ';
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

        if(type_operation=='P'){
            Final_Value=Last_Value;
            Last_Value=Float.parseFloat(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
            Final_Value+=Last_Value;
            Text_box.setText(Final_Value.toString());
        }else if(type_operation=='S'){

        }else if(type_operation=='M'){

        }else if(type_operation=='D'){

        }else{
            Toast.makeText(view.getContext(), "type d'operation non choisi ! ", Toast.LENGTH_SHORT).show();
        }

    }
    public void Value_typed_1(View view)
    {
        Text_box_text=Text_box.getText()+"1";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_2(View view)
    {
        Text_box_text=Text_box.getText()+"2";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_3(View view)
    {
        Text_box_text=Text_box.getText()+"3";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_4(View view)
    {
        Text_box_text=Text_box.getText()+"4";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_5(View view)
    {
        Text_box_text=Text_box.getText()+"5";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_6(View view)
    {
        Text_box_text=Text_box.getText()+"6";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_7(View view)
    {
        Text_box_text=Text_box.getText()+"7";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_8(View view)
    {
        Text_box_text=Text_box.getText()+"8";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_9(View view)
    {
        Text_box_text=Text_box.getText()+"9";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_0(View view)
    {
        Text_box_text=Text_box.getText()+"0";
        Text_box.setText(Text_box_text);
    }
    public void Value_typed_point(View view)
    {
        Text_box_text=Text_box.getText()+".";
        Text_box.setText(Text_box_text);
    }


    public void Value_typed_plus(View view)
    {
        try{

            Last_Value=Float.parseFloat(Text_box.getText().toString());
            type_operation='P';
            Text_box_text=Text_box.getText()+" + ";
            Text_box.setText(Text_box_text);

        }catch (Exception e)
        {
            Toast.makeText(view.getContext(),"format d'entrer est incalide !",Toast.LENGTH_SHORT);
        }

    }
    public void Value_typed_Minus(View view)
    {
        try{

            Last_Value=Float.parseFloat(Text_box.getText().toString());
            type_operation='S';
            Text_box_text=Text_box.getText()+" - ";
            Text_box.setText(Text_box_text);

        }catch (Exception e)
        {
            Toast.makeText(view.getContext(),"format d'entrer est invalide !",Toast.LENGTH_SHORT);
        }
    }
    public void Value_typed_multiply(View view)
    {
        try{

            Last_Value=Float.parseFloat(Text_box.getText().toString());
            type_operation='M';
            Text_box_text=Text_box.getText()+" * ";
            Text_box.setText(Text_box_text);

        }catch (Exception e)
        {
            Toast.makeText(view.getContext(),"format d'entrer est invalide !",Toast.LENGTH_SHORT);
        }
    }
    public void Value_typed_division(View view)
    {
        try{

            Last_Value=Float.parseFloat(Text_box.getText().toString());
            type_operation='D';
            Text_box_text=Text_box.getText()+" / ";
            Text_box.setText(Text_box_text);

        }catch (Exception e)
        {
            Toast.makeText(view.getContext(),"format d'entrer est invalide !",Toast.LENGTH_SHORT);
        }
    }


}