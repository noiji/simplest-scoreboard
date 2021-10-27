package com.example.scoreboard_simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";

    private TextView t1, t2;
    private View u1, u2, d1, d2;
    private int c1, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1);
        t1.setText(c1+"");

        t2 = findViewById(R.id.t2);
        t2.setText(c2+"");

        u1 = findViewById(R.id.u1);
        u2 = findViewById(R.id.u2);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);

        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: btnAdd : "+v.getClass().getName());
                if(c1<100) {
                    c1++;
                    t1.setText(c1+"");
                }

            }
        });

        u2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: btnAdd : "+v.getClass().getName());
                if(c2<100) {
                    c2++;
                    t2.setText(c2+"");
                }
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1>0) {
                    c1--;
                    t1.setText(c1+ "");
                }
            }
        });

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2>0) {
                    c2--;
                    t2.setText(c2+ "");
                }
            }
        });
    }

}

