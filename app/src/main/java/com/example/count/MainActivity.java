package com.example.count;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ApplyCountDownView mCountProgress;
    private ApplyCountDownView mCountProgress1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountProgress = findViewById(R.id.progress_bar);
        mCountProgress1 = findViewById(R.id.progress_bar1);
        mCountProgress.start();
        mCountProgress1.start();
        mCountProgress1.setOnLoadingFinishListener(new ApplyCountDownView.OnLoadingFinishListener() {
            @Override
            public void finish() {
                Toast.makeText(MainActivity.this, "黑色的倒计时结束了", Toast.LENGTH_SHORT).show();
            }
        });
        mCountProgress.setOnLoadingFinishListener(new ApplyCountDownView.OnLoadingFinishListener() {
            @Override
            public void finish() {
                Toast.makeText(MainActivity.this, "倒计时结束了", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
