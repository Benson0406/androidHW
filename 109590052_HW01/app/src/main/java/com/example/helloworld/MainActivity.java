
package com.example.android.helloconstraint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mCount % 2 == 0){
            view.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        }else{
            view.setBackgroundColor(0xFF5F1F00);
        }
        if (mCount != 0){
            Button button = (Button) findViewById(R.id.button_zero);
            button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countZero(View view){
        mCount = 0;
        view.setBackgroundColor(getResources().getColor(R.color.colorGray));
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
