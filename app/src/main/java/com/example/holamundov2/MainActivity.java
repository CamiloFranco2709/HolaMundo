package com.example.holamundov2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private TextView txt;

    public void proc(){
        btn1 = findViewById(R.id.btn1);
        txt = findViewById(R.id.txt);

        btn1.setOnClickListener(new OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                txt.setText("Hello World");
            }});}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proc();
    }
}
