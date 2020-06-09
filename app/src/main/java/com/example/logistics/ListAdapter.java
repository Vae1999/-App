package com.example.logistics;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
  private List<Element_list> element_lists;
  private Context context;

  static class ViewHolder extends RecyclerView.ViewHolder{
    Button button;
    public ViewHolder(View view){
      super(view);
      button = (Button)view.findViewById(R.id.menu_name);
    }
  }
  public ListAdapter(List<Element_list> element_lists,Context context){
    this.element_lists = element_lists;
    this.context = context;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.element_list,parent,false);
    final ViewHolder holder = new ViewHolder(view);
    holder.button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        //Toast.makeText(context,holder.getAdapterPosition()+" aa "+holder.getLayoutPosition(),Toast.LENGTH_SHORT).show();
        Intent intent;
        switch (holder.getLayoutPosition()){
          case 0:
            intent = new Intent(context,ItemActivity.class);
            context.startActivity(intent);
            break;
          case 1:
            intent = new Intent(context,NeedActivity.class);
            context.startActivity(intent);
            break;
          case 2:
            intent = new Intent(context,FactoryActivity.class);
            context.startActivity(intent);
            break;
          case 3:
            intent = new Intent(context,StoreActivity.class);
            context.startActivity(intent);
            break;
          case 4:
            intent = new Intent(context,ShipActivity.class);
            context.startActivity(intent);
            break;
          case 5:
            intent = new Intent(context,SettingActivity.class);
            context.startActivity(intent);
            break;
          default:
        }
      }
    });
    return holder;
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Element_list element_list = element_lists.get(position);
    holder.button.setText(element_list.getName());
  }

  @Override
  public int getItemCount() {
    return element_lists.size();
  }

}