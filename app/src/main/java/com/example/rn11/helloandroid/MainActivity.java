package com.example.rn11.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int value = 0;
    private Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickMe = (Button) findViewById(R.id.btnClickMe);
        btnClickMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float size;
        switch(v.getId()){

        }
    }
}
