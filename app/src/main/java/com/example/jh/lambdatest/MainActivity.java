package com.example.jh.lambdatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 本demo测试jdk1.8的配置以及lambda表达式的使用   。。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);

        // 1.传统点击事件
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "按钮一被点击", Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(v -> Toast.makeText(MainActivity.this, "按钮一被点击", Toast.LENGTH_LONG).show());
        //2、实现接口
        new Thread(() -> {
            Log.e("TAG", "实现接口");
        }).start();
    }
}
