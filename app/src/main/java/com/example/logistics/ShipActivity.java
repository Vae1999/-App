package com.example.logistics;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ShipActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ship);
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

    TextView textView = (TextView)findViewById(R.id.ship_phone);
    textView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Uri uri = Uri.parse("tel:33333");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
      }
    });
    Button button = (Button)findViewById(R.id.ship_button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(ShipActivity.this,ShipPositionActivity.class);
        startActivity(intent);
      }
    });
  }
}
