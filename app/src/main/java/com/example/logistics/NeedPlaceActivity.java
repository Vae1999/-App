package com.example.logistics;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class NeedPlaceActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_need_place);

    TextView textView = (TextView)findViewById(R.id.need_place_phone);
    textView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Uri uri = Uri.parse("tel:55555");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
      }
    });
  }
}
