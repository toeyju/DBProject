package com.example.dbproject.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by RTA on 12/6/2017.
 */

public class DBHelper extends SQLiteOpenHelper{

    private final String TAG = getClass().getSimpleName();
    private static final String DATABASE_NAME = "potter.db";
    private static final int DATABASE_VERSION = 1;


    public static final String TABLE_NAME = "phone_number";
    public static final String COL_ID = "_id";
    public static final String COL_quiz = "question";
    public static final String COL_pic = "picture";
    public static final String COL_right = "rightans";
    public static final String COL_wrong = "wrongans";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + COL_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL_quiz + " TEXT, "
                + COL_pic + " INTEGER, "
                + COL_right + " TEXT, "
                + COL_wrong + " TEXT, ";

        db.execSQL(CREATE_TABLE);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_quiz, "อาจารย์สอนวิชาป้องกันตัวจากศาสตร์มืดคนที่ 6 ในโรงเรียนของแฮร์รี่คือใคร?");
        cv.put(COL_pic, "quiz1.jpg");
        cv.put(COL_right, "เซเวอร์รัส สเนป");
        cv.put(COL_wrong, "โดโลเรส อัมบริดจ์");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "สถานที่ที่ต้องเข้าไปในตู้โทรศัพท์แล้วกดรหัส 62442 คือ?");
        cv.put(COL_pic, "quiz2.jpg");
        cv.put(COL_right, "กระทรวงเวทมนต์");
        cv.put(COL_wrong, "ห้องแห่งความลับ");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "คนที่ชักนำแฮร์รี่เข้าทีมควิชดิชคือใคร?");
        cv.put(COL_pic, "quiz3.jpg");
        cv.put(COL_right, "ศาสตราจารย์มักกอนนากัล");
        cv.put(COL_wrong, "รอน วีสลีย์");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "ผู้ก่อตั้งฮอกวอตส์มีกี่คน?");
        cv.put(COL_pic, "quiz4.jpg");
        cv.put(COL_right, "4 คน");
        cv.put(COL_wrong, "5 คน");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "คนที่ได้จูบแรกของแฮร์รี่ พอตเตอร์คือใคร?");
        cv.put(COL_pic, "quiz5.jpg");
        cv.put(COL_right, "โช แชง");
        cv.put(COL_wrong, "จินนี่ วีสลี่ย์");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "สถานที่เกิดโศกนาฎกรรมกับครอบครัวพอตเตอร์คือที่ใด?");
        cv.put(COL_pic, "quiz6.jpg");
        cv.put(COL_right, "ก็อดดริด ฮอลโลว์");
        cv.put(COL_wrong, "ฮอกวอสต์");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "สถานที่ที่ลูปินใช้กลายร่างเป็นมนุษย์หมาป่าอย่างปลอดภัยคือที่ใด?");
        cv.put(COL_pic, "quiz7.jpg");
        cv.put(COL_right, "เพิงโหยหวน");
        cv.put(COL_wrong, "กริมโมลด์เลซ");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "ใครคือคนพาแฮร์รี่ มาส่งที่บ้านเดอร์สลีย์?");
        cv.put(COL_pic, "quiz8.jpg");
        cv.put(COL_right, "รูเบอัส แฮกริด");
        cv.put(COL_wrong, "รอน วีสลีย์");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "ใครเป็นพ่อทูนหัวของแฮร์รี่?");
        cv.put(COL_pic, "quiz9.jpg");
        cv.put(COL_right, "ซิเรียส แบล็ค");
        cv.put(COL_wrong, "เจมส์ พอตเตอร์");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_quiz, "แฮร์รี่ซื้อไม้กายสิทธิ์ที่ร้านอะไร?");
        cv.put(COL_pic, "quiz10.jpg");
        cv.put(COL_right, "ร้านโอลิแวนเดอร์");
        cv.put(COL_wrong, "ร้านหม้อใหญ่รั่ว");
        db.insert(TABLE_NAME, null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    
    /*public List<PotterItem> getDataList(){
        List<PotterItem> data = new ArrayList<>();

        sqLiteDatabase = this.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.query(
            TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null);


        while (cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex(DBHelper.COL_ID));
            String quiz = cursor.getString(cursor.getColumnIndex(DBHelper.COL_quiz));
            String picture = cursor.getString(cursor.getColumnIndex(DBHelper.COL_pic));
            String rightans = cursor.getString(cursor.getColumnIndex(DBHelper.COL_right));
            String wrongans = cursor.getString(cursor.getColumnIndex(DBHelper.COL_wrong));

            PotterItem item = new PotterItem(id, quiz, picture, rightans, wrongans);
            data.add(item);

        }

        return data;
    }*/
}
