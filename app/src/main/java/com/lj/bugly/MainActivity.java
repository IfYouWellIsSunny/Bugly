package com.lj.bugly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.bugly.Bugly;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bugly.init(getApplicationContext(), "f23cd6d032", false);

        //branch

        //fgfgfg

        //GHGHGHGH
    }
}
