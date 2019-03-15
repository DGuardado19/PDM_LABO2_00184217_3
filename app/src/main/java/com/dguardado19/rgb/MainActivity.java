package com.dguardado19.rgb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt1, bt2, bt3;
    private LinearLayout mLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.rojoh);
        bt2 = findViewById(R.id.verdeh);
        bt3 = findViewById(R.id.azulh;

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
    }
ss
    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Log.i("id",viewId +"");
        switch (viewId){
            case
        }


    }
}
