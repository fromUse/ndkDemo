package com.conykais.normalndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import conykais.jnilib.JniUtils;
import conykais.jnilib2.JniTest;

public class MainActivity extends AppCompatActivity {
    private JniUtils jniUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jniUtils = new JniUtils();
        TextView textView = (TextView) findViewById(R.id.text);
        TextView textView2 = (TextView) findViewById(R.id.text2);
//        textView.setText(jniUtils.getString());
        textView.setText(JniTest.getIntForJNI() + "----");
        String str = "123aaa阿";
        textView2.setText(str + ",字符串的长度: " + jniUtils.getStringLenght(str));
    }
}
