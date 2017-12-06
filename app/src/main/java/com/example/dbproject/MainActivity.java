package com.example.dbproject;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

import com.example.dbproject.db.DBHelper;

import java.util.List;

public class MainActivity extends ListActivity{
        //AppCompatActivity

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/


    DBHelper mHelper;
    List<String> potter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] lists = {""};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lists);
        setListAdapter(adapter);
    }
}
