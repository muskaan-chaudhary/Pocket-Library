package com.example.pocketlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class ThirdActivity extends AppCompatActivity {
EditText e1;
Button b1;
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        e1 = findViewById(R.id.ed);
        b1 = findViewById(R.id.bt);
        lv = findViewById(R.id.lv);
    }
}
