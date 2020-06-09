package com.example.logistics;

public class Element_list{
  private String name;
  private int imageId;

  public Element_list(String name,int i){
    this.name = name;
    imageId = i;
  }
  public String getName(){
    return name;
  }

  public int getImageId() {
    return imageId;
  }
}