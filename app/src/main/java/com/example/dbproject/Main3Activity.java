package com.example.dbproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        next = findViewById(R.id.next_button);

        Intent page2 = new Intent(Main3Activity.this,Main2Activity.class);
        startActivity(page2);

    }
}
