package com.example.app2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView in,ct;
    Button bt1,bt2;
   int add=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in=findViewById(R.id.info);
        ct=findViewById(R.id.count);
        bt1=findViewById(R.id.ADD);
        bt2=findViewById(R.id.Sub);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            ct.setText(" " +count_add());
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ct.setText(" "+ count_sub());
            }
        });



    }
    public int count_add(){
      return  ++add;}
    public int count_sub() {

          return --add;

        }
    }
