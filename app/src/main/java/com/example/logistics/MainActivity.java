package com.example.logistics;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Button button1 = (Button)findViewById(R.id.button1);
    Button button2 = (Button)findViewById(R.id.button2);
    button1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this,"加载数据库",Toast.LENGTH_SHORT).show();
        LitePal.getDatabase();
      }
    });
    button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Item item = new Item();
        item.setI_id(111);
        item.setI_name("口罩");
        item.setPress("1");
        item.save();
        Toast.makeText(MainActivity.this,"添加数据",Toast.LENGTH_SHORT).show();
      }
    });

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
