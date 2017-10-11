package com.express.remindme.db;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by root on 11/10/17.
 */

public class AppDatabase extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="Reminderdb";
    private static final String TABLE_REMINDER="reminder";


    private static final String KEY_ID="id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_DATETIME = "datetime";


    private static AppDatabase appDatabase;

    private AppDatabase(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public static synchronized AppDatabase getInstance(Context context) {
        if(appDatabase == null) {
            appDatabase = new AppDatabase(context.getApplicationContext());
        }
        return appDatabase;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_REMINDER_TABLE ="CREATE TABLE "+ TABLE_REMINDER + "("
                + KEY_ID +" INTEGER PRIMARY KEY, "+ KEY_TITLE + " TEXT, "
                + KEY_DESCRIPTION + " TEXT, "+ KEY_DATETIME+" TEXT)";
        db.execSQL(CREATE_REMINDER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_REMINDER);
    }
}
