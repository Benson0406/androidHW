package com.example.a109590052_hw4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mcount = 0;
    private TextView mShowCount;
    private String key1 = "countValue";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d(LOG_TAG,"onSaveInstanceState");
        if (mShowCount.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putInt(key1,mcount);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.text_main);
        Log.d(LOG_TAG,"--------");
        Log.d(LOG_TAG,"onCreate");
        if(savedInstanceState != null){
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if(isVisible){
                mcount = savedInstanceState.getInt(key1);
            }
        }
        mShowCount.setText(Integer.toString(mcount));
    }
    public void numbercount(View view){
        mcount++;
        if(mShowCount!=null)
            mShowCount.setText(Integer.toString(mcount));
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}