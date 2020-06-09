package com.example.logistics;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class NeedActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_need);
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

  }
}
