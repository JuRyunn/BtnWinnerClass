package com.example.btnwinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button nButton1, nButton;
    TextView nTextView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nButton = findViewById(R.id.button);
        nButton1 = findViewById(R.id.button1);
        nTextView1 = findViewById(R.id.textView1);

        nButton1.setOnClickListener(new MyOnClickListener());
        nButton.setOnClickListener(new MyOnClickListener());
    }

    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1: nTextView1.setText("You Clicked Button 1"); break;
                case R.id.button: nTextView1.setText("You Clicked Button"); break;
                default: break;
            }
        }
    }
}