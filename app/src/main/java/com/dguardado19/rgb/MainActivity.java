package com.dguardado19.rgb;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt1, bt2, bt3;
    private LinearLayout mLinearLayout;
    private ArrayList<Drawable> rojos = new ArrayList<>();
    private ArrayList<Drawable> verdes = new ArrayList<>();
    private ArrayList<Drawable> azules = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.rojoh);
        bt2 = findViewById(R.id.verdeh);
        bt3 = findViewById(R.id.azulh);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        rojos.add(getResources().getDrawable(R.color.Rojo));
        rojos.add(getResources().getDrawable(R.color.Rojo1));
        rojos.add(getResources().getDrawable(R.color.Rojo2));
        rojos.add(getResources().getDrawable(R.color.Rojo3));
        rojos.add(getResources().getDrawable(R.color.Rojo4));
        rojos.add(getResources().getDrawable(R.color.Rojo5));

        verdes.add(getResources().getDrawable(R.color.green));
        verdes.add(getResources().getDrawable(R.color.green1));
        verdes.add(getResources().getDrawable(R.color.green2));
        verdes.add(getResources().getDrawable(R.color.green3));
        verdes.add(getResources().getDrawable(R.color.green4));
        verdes.add(getResources().getDrawable(R.color.green5));

        azules.add(getResources().getDrawable(R.color.azul));
        azules.add(getResources().getDrawable(R.color.azul1));
        azules.add(getResources().getDrawable(R.color.azul2));
        azules.add(getResources().getDrawable(R.color.azul3));
        azules.add(getResources().getDrawable(R.color.azul4));
        azules.add(getResources().getDrawable(R.color.azul5));
    }

    @Override
    public void onClick(View v) {


        int bot = v.getId();
        int n= (int)(Math.random()*5);
        Log.i("id",bot +"");
        switch (bot){
            case R.id.rojoh:
                bt1.setBackground(rojos.get(n));
                break;
            case R.id.verdeh:
                bt2.setBackground(verdes.get(n));
                break;
            case R.id.azulh:
                bt3.setBackground(azules.get(n));

        }


    }
}
