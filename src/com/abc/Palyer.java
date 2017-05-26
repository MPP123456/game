package com.abc;

import java.util.ArrayList;
import java.util.List;
/*
 * ÕÊº“¿‡
 */
public class Palyer<Card> {
  private int id;
  public int getId(){
	  return id;
  }
  public void setId(){
	  this.id=id;
  }
  private String name;
  public String getname(){
	  return name;
  }
  public void setname(){
	  this.name=name;
  }
  public List<Card>cards;
  
  public Palyer(int id, String name){
	  this.id=id;
	  this.name=name;
	  this.cards=new ArrayList<Card>();
  }
  public String size(){
	  return null;
  }
}
