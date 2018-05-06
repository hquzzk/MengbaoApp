package com.example.zx.mengbaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class linearlayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);
        Button goback = (Button)  findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(linearlayout.this, MainActivity .class );
                startActivity(intent);

            }
        });
        final LinearLayout linearlayout = findViewById(R.id.line1);
        Button kaozuo = (Button)  findViewById(R.id.kaozuo);
        kaozuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearlayout.setGravity(Gravity.LEFT);
            }
        });
        Button shuiping = (Button)  findViewById(R.id.shuiping);
        shuiping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearlayout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        Button chuizhi = (Button)  findViewById(R.id.chuizhi);
        chuizhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearlayout.setGravity(Gravity.CENTER);
                linearlayout.setOrientation(LinearLayout.VERTICAL);
            }
        });
    }
}
