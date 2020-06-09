package com.example.logistics;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ItemAddActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_item_add);

    ActionBar actionBar = getSupportActionBar();
    if(actionBar!=null){
      actionBar.hide();
    }

  }
}
