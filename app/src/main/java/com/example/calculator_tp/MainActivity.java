package com.example.calculator_tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;
import java.util.concurrent.ExecutionException;

import javax.crypto.ExemptionMechanismException;

public class MainActivity extends AppCompatActivity {

    Double Final_Value=null;
    TextView Text_box;
    Double Last_Value=null;
    String Text_box_text="";
    Character type_operation=' ';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text_box= findViewById(R.id.Text_box);
        Text_box.setText("");

    }

    public void Clear(View view){

        Final_Value=null;
        Last_Value=null;
        Text_box.setText(null);
        type_operation=' ';


    }
    public void Result(View view){
        try {
            if (type_operation == 'P') {
                Final_Value = Last_Value;
                Last_Value = Double.parseDouble(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
                Final_Value += Last_Value;
                Text_box.setText(Final_Value.toString());
                type_operation = ' ';
            } else if (type_operation == 'S') {
                Final_Value = Last_Value;
                Last_Value = Double.parseDouble(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
                Final_Value -= Last_Value;
                Text_box.setText(Final_Value.toString());
                type_operation = ' ';

            } else if (type_operation == 'M') {
                Final_Value = Last_Value;
                Last_Value = Double.parseDouble(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
                Final_Value *= Last_Value;
                Text_box.setText(Final_Value.toString());
                type_operation = ' ';

            } else if (type_operation == 'D') {
                Final_Value = Last_Value;
                Last_Value = Double.parseDouble(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
                if (Last_Value == 0) {
                    Toast.makeText(this, "impossible de divise par 0 ! ", Toast.LENGTH_SHORT).show();

                } else {
                    Final_Value /= Last_Value;
                    Text_box.setText(Final_Value.toString());

                }

                type_operation = ' ';

            } else if (type_operation == 'G') {
                Final_Value = Last_Value;
                Last_Value = Double.parseDouble(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
                Final_Value = Math.pow(Final_Value, Last_Value);
                Text_box.setText(Final_Value.toString());
                type_operation = ' ';

            }
            else if (type_operation == 'F') {
                Final_Value = Last_Value;
                Last_Value = Double.parseDouble(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
                Final_Value %=Last_Value;
                Text_box.setText(Final_Value.toString());
                type_operation = ' ';

            }
            else if (type_operation == 'R') {
                Last_Value = Double.parseDouble(Text_box.getText().toString().substring(Text_box.getText().toString().lastIndexOf(" ")));
                Final_Value = Math.sqrt(Last_Value);
                Text_box.setText(Final_Value.toString());
                type_operation = ' ';

            }
            else {
                Toast.makeText(this, "operation non choisi", Toast.LENGTH_SHORT).show();

            }
        }catch(Exception e){
            Toast.makeText(this,"inserez le deuxiem nombre !",Toast.LENGTH_SHORT).show();
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


            Last_Value=Double.parseDouble(Text_box.getText().toString());
            type_operation='P';
            Text_box_text=Text_box.getText()+" + ";
            Text_box.setText(Text_box_text);

        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "forma incorrect",Toast.LENGTH_SHORT).show();

        }

    }
    public void Value_typed_Minus(View view)
    {

        try{


            Last_Value=Double.parseDouble(Text_box.getText().toString());
            type_operation='S';
            Text_box_text=Text_box.getText()+" - ";
            Text_box.setText(Text_box_text);

        }catch (Exception  e)
        {
            Toast.makeText(getApplicationContext(), "forma incorrect",Toast.LENGTH_SHORT).show();
        }

    }
    public void Value_typed_multiply(View view)
    {

        try{

            Last_Value=Double.parseDouble(Text_box.getText().toString());
            type_operation='M';
            Text_box_text=Text_box.getText()+" * ";
            Text_box.setText(Text_box_text);

        }catch (Exception  e)
        {
            Toast.makeText(getApplicationContext(), "forma incorrect",Toast.LENGTH_SHORT).show();
        }

    }
    public void Value_typed_division(View view)
    {

        try{
            Last_Value=Double.parseDouble(Text_box.getText().toString());
            type_operation='D';
            Text_box_text=Text_box.getText()+" / ";
            Text_box.setText(Text_box_text);

        }catch (Exception  e)
        {
            Toast.makeText(getApplicationContext(), "forma incorrect",Toast.LENGTH_SHORT).show();

        }

    }
    public void Value_typed_power(View view)
    {

        try{
            Last_Value=Double.parseDouble(Text_box.getText().toString());
            type_operation='G';
            Text_box_text=Text_box.getText()+" ^ ";
            Text_box.setText(Text_box_text);

        }catch (Exception  e)
        {
            Toast.makeText(getApplicationContext(), "forma incorrect",Toast.LENGTH_SHORT).show();

        }

    }
    public void Value_typed_racine(View view)
    {

        try{
            if(Text_box.getText()==""){
                type_operation='R';
                Text_box_text=Text_box.getText()+"√ ";
                Text_box.setText(Text_box_text);
            }else{
               Toast.makeText(this,"format incorrect",Toast.LENGTH_SHORT).show();


            }


        }catch (Exception  e)
        {
            Toast.makeText(getApplicationContext(), "forma incorrect",Toast.LENGTH_SHORT).show();


        }

    }
    public void Value_typed_Modulo(View view)
    {

        try{
            Last_Value=Double.parseDouble(Text_box.getText().toString());
            type_operation='F';
            Text_box_text=Text_box.getText()+" % ";
            Text_box.setText(Text_box_text);

        }catch (Exception  e)
        {
            Toast.makeText(getApplicationContext(), "forma incorrect",Toast.LENGTH_SHORT).show();

        }

    }




}