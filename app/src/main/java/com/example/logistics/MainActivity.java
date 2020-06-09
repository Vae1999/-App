package com.example.logistics;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Date;
import java.util.List;
import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    //Button button1 = (Button)findViewById(R.id.button1);
    //Button button2 = (Button)findViewById(R.id.button2);
    //button1.setOnClickListener(new View.OnClickListener() {
    //  @Override
    //  public void onClick(View v) {
    //    Toast.makeText(MainActivity.this,"加载数据库",Toast.LENGTH_SHORT).show();
    //    LitePal.getDatabase();
    //  }
    //});
    //button2.setOnClickListener(new View.OnClickListener() {
    //  @Override
    //  public void onClick(View v) {
    //    Item item = new Item();
    //    item.setI_id(111);
    //    item.setI_name("口罩");
    //    item.save();
    //    Toast.makeText(MainActivity.this,"添加数据",Toast.LENGTH_SHORT).show();
    //  }
    //});
    //Button button3 = (Button)findViewById(R.id.button3);
    //button3.setOnClickListener(new View.OnClickListener() {
    //  @Override
    //  public void onClick(View v) {
    //    List<Item> itemList = LitePal.findAll(Item.class);
    //    Toast.makeText(v.getContext(),"读取数据",Toast.LENGTH_SHORT).show();
    //    if(itemList==null){
    //      Toast.makeText(v.getContext(),"数据库为空",Toast.LENGTH_SHORT).show();
    //    }
    //    for(Item item:itemList){
    //      Log.d("sssss: ", item.getI_name()+" "+item.getI_id());
    //    }
    //  }
    //});

    Button button = (Button)findViewById(R.id.login);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,ListActivity.class);
        startActivity(intent);
      }
    });
  }
}
