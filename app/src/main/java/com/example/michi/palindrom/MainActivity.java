package com.example.michi.palindrom;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static boolean isPalindrome(String str)	{
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public void checkString(View view){
        EditText input = (EditText) findViewById(R.id.txtInput);
        TextView output = (TextView) findViewById(R.id.lblError);
        if(input.getText().toString().length()>4) {
            if (isPalindrome(input.getText().toString())) {
                output.setTextColor(Color.GREEN);
                output.setText("String ist ein Palindrom!");
            } else {
                output.setTextColor(Color.RED);
                output.setText("String ist kein Palindrom!");
            }
        }
        else{
            output.setTextColor(Color.RED);
            output.setText("String ist zu kurz!");
        }
    }
}
