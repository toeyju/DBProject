package com.example.dbproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dbproject.adapter.AdapterList;
import com.example.dbproject.db.DBHelper;
import com.example.dbproject.model.Potter;
import com.example.dbproject.model.PotterItem;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.example.dbproject.db.DBHelper.TABLE_NAME;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<Potter> aList = PotterData.potterList;
    private int[] Array =  new int[100];
    Button correct,wrong;
    TextView quiz;
    ImageView pic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        correct = findViewById(R.id.button1);
        wrong = findViewById(R.id.button2);
        quiz = findViewById(R.id.quiz_text);
        pic = findViewById(R.id.pic);

        if(savedInstanceState == null){
            aList.add(new Potter(getString(R.string.quiz_1),"quiz_1.jpg" ,getString(R.string.ans_1), getString(R.string.wrong_1)));
            aList.add(new Potter(getString(R.string.quiz_2),"quiz_2.jpg" ,getString(R.string.ans_2), getString(R.string.wrong_2)));
            aList.add(new Potter(getString(R.string.quiz_3),"quiz_3.jpg" ,getString(R.string.ans_3), getString(R.string.wrong_3)));
            aList.add(new Potter(getString(R.string.quiz_4),"quiz_4.jpg" ,getString(R.string.ans_4), getString(R.string.wrong_4)));
            aList.add(new Potter(getString(R.string.quiz_5),"quiz_5.jpg" ,getString(R.string.ans_5), getString(R.string.wrong_5)));
            aList.add(new Potter(getString(R.string.quiz_6),"quiz_6.jpg" ,getString(R.string.ans_6), getString(R.string.wrong_6)));
            aList.add(new Potter(getString(R.string.quiz_7),"quiz_7.jpg" ,getString(R.string.ans_7), getString(R.string.wrong_7)));
            aList.add(new Potter(getString(R.string.quiz_8),"quiz_8.jpg" ,getString(R.string.ans_8), getString(R.string.wrong_8)));
            aList.add(new Potter(getString(R.string.quiz_9),"quiz_9.jpg" ,getString(R.string.ans_9), getString(R.string.wrong_9)));
            aList.add(new Potter(getString(R.string.quiz_10),"quiz_10.jpg" ,getString(R.string.ans_10), getString(R.string.wrong_10)));
        }


}
}
