package com.example.logistics;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
  private List<Element_list> element_lists = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    initList();
    RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(linearLayoutManager);
    ListAdapter adapter = new ListAdapter(element_lists,this);
    recyclerView.setAdapter(adapter);
  }
  private void initList(){
    for (int i = 0;i<1;i++){
      Element_list item = new Element_list("物资",R.drawable.item);
      element_lists.add(item);
      Element_list need = new Element_list("需求",R.drawable.need);
      element_lists.add(need);
      Element_list factory = new Element_list("厂商",R.drawable.factory);
      element_lists.add(factory);
      Element_list store = new Element_list("仓库",R.drawable.store);
      element_lists.add(store);
      Element_list ship = new Element_list("配送",R.drawable.ship);
      element_lists.add(ship);
      Element_list setting = new Element_list("设置",R.drawable.setting);
      element_lists.add(setting);
      Element_list other = new Element_list("其他",R.drawable.setting);
      element_lists.add(other);
    }
  }
}
