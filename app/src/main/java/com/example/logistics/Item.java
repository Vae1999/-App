package com.example.logistics;

import org.litepal.crud.LitePalSupport;

public class Item extends LitePalSupport {
  private int i_id;
  private String i_name;

  public int getI_id(){
    return i_id;
  }
  public String getI_name(){
    return i_name;
  }
  public void setI_id(int id){
    i_id = id;
  }
  public void setI_name(String name){
    i_name = name;
  }
}
