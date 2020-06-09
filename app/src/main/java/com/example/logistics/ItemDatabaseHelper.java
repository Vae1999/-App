package com.example.logistics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class ItemDatabaseHelper extends SQLiteOpenHelper {
  public static final String CREATE_ITEM = "create table Item("
      + "item_id integer,"
      + "item_name text)";
  private Context mContext;
  public ItemDatabaseHelper(Context context,String name, SQLiteDatabase.CursorFactory factory,int version){
    super(context, name, factory, version);
    mContext = context;
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_ITEM);
    Toast.makeText(mContext,"Create succeeded",Toast.LENGTH_SHORT).show();
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

  }
}
