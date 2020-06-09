package com.example.logistics;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
  private List<Element_list> element_lists;
  private Context context;

  static class ViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView textView;
    public ViewHolder(View view){
      super(view);
      imageView = (ImageView)view.findViewById(R.id.menu_image);
      textView = (TextView) view.findViewById(R.id.menu_name);
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
    holder.imageView.setOnClickListener(new View.OnClickListener() {
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
    holder.textView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
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
    holder.textView.setText(element_list.getName());
    holder.imageView.setImageResource(element_list.getImageId());
  }

  @Override
  public int getItemCount() {
    return element_lists.size();
  }

}