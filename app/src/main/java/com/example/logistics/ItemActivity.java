package com.example.logistics;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ItemActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_item);
    ActionBar actionBar = getSupportActionBar();
    if(actionBar!=null){
      actionBar.hide();
    }

    Button back = (Button)findViewById(R.id.title_back);
    Button add = (Button)findViewById(R.id.title_add);
    back.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        finish();
      }
    });
    add.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(v.getContext(),"你点击了添加",Toast.LENGTH_SHORT).show();
      }
    });

    TextView t1 = (TextView)findViewById(R.id.item_had_name);
    t1.setText("2000");
    TextView t2 = (TextView)findViewById(R.id.item_need_name);
    t2.setText("300");
    Button button1 = (Button)findViewById(R.id.item_had_button);
    button1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(ItemActivity.this,Store_iActivity.class);
        startActivity(intent);
      }
    });
    Button button2 = (Button)findViewById(R.id.item_need_button);
    button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(ItemActivity.this,NeedPlaceActivity.class);
        startActivity(intent);
      }
    });
  }
}
