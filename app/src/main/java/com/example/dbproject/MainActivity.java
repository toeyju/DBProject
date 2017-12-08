package com.example.dbproject;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.*;
import com.example.dbproject.db.DBHelper;

import java.util.List;

public class MainActivity extends AppCompatActivity{

    static String Name[] = new String[5];
    static int Score[] = new int [20];
    private Button button,buttonn;
    private EditText editText;
    ArrayAdapter<String> data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button =  findViewById(R.id.button1);
        buttonn =  findViewById(R.id.button2);
        editText = findViewById(R.id.text1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a);
            }
        });

        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
