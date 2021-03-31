package com.example.btnwinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button nButton1;
    TextView nTextView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nButton1 = (Button) findViewById(R.id.button1);
        nTextView1 = findViewById(R.id.textView1);

        nButton1.setOnClickListener(new MyOnClickListener(this));

    }
}