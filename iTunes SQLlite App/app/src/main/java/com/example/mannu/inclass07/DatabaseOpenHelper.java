package com.example.mannu.inclass07;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mannu on 6/16/2016.
 */
public class DatabaseOpenHelper extends SQLiteOpenHelper {
    static  final String DB_NAME ="mynotes.db";
    static  final int DB_VERSION=1;

    public DatabaseOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        AppList.onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        AppList.onUpgrade(db,oldVersion,newVersion);
    }
}
