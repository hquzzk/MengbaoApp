package com.example.zx.mengbaoapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class framelayout extends AppCompatActivity {
    final int[] imageIds = new int[]
            {
                    R.drawable.gray,
                    R.drawable.orange,
                    R.drawable.green,
                    R.drawable.blue,
            };
    int currentImageId = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        Button goback = (Button) findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(framelayout.this, MainActivity.class);
                startActivity(intent);
            }
        });
        final ImageView show = (ImageView) findViewById(R.id.show);
        @SuppressLint("HandlerLeak") final Handler myHandler = new Handler()
        {
            public  void handleMessage(Message msg)
            {
                if (msg.what == 0x1233)
                {
                    show.setImageResource(imageIds[currentImageId++ % imageIds.length]);
                }
            }
        };
        new Timer().schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                myHandler.sendEmptyMessage(0x1233);
            }
        },0,200);
    }
}
