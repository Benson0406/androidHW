package com.example.a109590052_hw6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "error";

    CheckBox check1, check2, check3, check4, check5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        check4 = (CheckBox) findViewById(R.id.checkBox4);
        check5 = (CheckBox) findViewById(R.id.checkBox5);

    }

    public void viewCheckBox(View view){
        StringBuffer message1 = new StringBuffer();
        if ((check1.isChecked())){
            message1.append(check1.getText().toString());
            message1.append(" ");
        }
        if (check2.isChecked()){
            message1.append(check2.getText().toString());
            message1.append(" ");
        }
        if (check3.isChecked()){
            message1.append(check3.getText().toString());
            message1.append(" ");
        }
        if (check4.isChecked()){
            message1.append(check4.getText().toString());
            message1.append(" ");
        }
        if (check5.isChecked()){
            message1.append(check5.getText().toString());
            message1.append(" ");
        }
        viewTheMessage(message1);
    }

    public void viewTheMessage(StringBuffer message2){
        Toast.makeText(getApplicationContext(), message2,
                Toast.LENGTH_SHORT).show();
    }
}