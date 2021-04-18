package com.example.expintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txthello;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txthello = (TextView) findViewById(R.id.txthello);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txthello.setText("Hello, " + nama + " !");

    }
}