package com.example.tugas1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tb1(View view) {
        Intent tbl1 = new Intent(MainActivity.this, LinearLayoutActivity.class);
        startActivity(tbl1);
    }

    public void tb2(View view) {
        Intent tbl2 = new Intent(MainActivity.this, RelativeLayoutActivity.class);
        startActivity(tbl2);
    }

    public void tb3(View view) {
        Intent tbl3 = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
        startActivity(tbl3);
    }

    public void tb4(View view) {
        Intent tbl4 = new Intent(MainActivity.this, FrameLayoutActivity.class);
        startActivity(tbl4);
    }

    public void tb5(View view) {
        Intent tbl5 = new Intent(MainActivity.this, TableLayoutActivity.class);
        startActivity(tbl5);
    }

    public void tb6(View view) {
        Intent tbl6 = new Intent(MainActivity.this, MaterialDesign.class);
        startActivity(tbl6);
    }

    public void tb7(View view) {
        Intent tbl7 = new Intent(MainActivity.this, ScrollView.class);
        startActivity(tbl7);
    }

    public void tb8(View view) {
        Intent tbl8 = new Intent(MainActivity.this, ScorllViewHorizontal.class);
        startActivity(tbl8);
    }

}

//public class MainActivity extends AppCompatActivity {
//    EditText Pada, Subject, Pesan;
//    Button Submit;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Pada = findViewById(R.id.pada);
//        Subject = findViewById(R.id.subject);
//        Pesan = findViewById(R.id.pesan);
//        Submit = findViewById(R.id.submit);
//    }
//}

