package com.abc;

public class Puke implements Comparable<Puke>{
      public String color;//�Ƶ���ɫ
      public String num;//�Ƶĵ���
   public Puke(String coloir,String num, String color){
	   this.color=color;
	   this.num=num;
	   
   }
   /*
    * �����ƵĹ���
    */
@Override
public int compareTo(Puke o) {
	// TODO Auto-generated method stub
	if(this.num==o.num){
		if(this.color.equals("����")){
			if(o.color.equals("����")){
				return 0;
			}
			else{
				return 1;
			}					
		}
		else if(this.color.equals("����")){
			if(o.color.equals("����")){
				return -1;
			}
			else if(o.color.equals("����")){
			    return 0;
			}
			else{
				return 1;
			}
		}
		else if(this.color.equals("÷��")){
			if(o.color.equals("����")||o.color.equals("����")){
				return -1;
			}
			else if(o.color.equals("÷��")){
				return 0;
			}
			else{
				return 1;
			}
		}
		else if(o.color.equals("��Ƭ")){
				return 0;
			}
		else{
			return 1;
		}
	}
	else{
		if(this.num.equals("A")){
			if(o.num .equals("A")){
				return 0;
			}
			else{
				return 1;
			}
			
		}
		else if(this.num.equals("K")){
			if(o.num.equals("A")){
				return -1;
			}
			else if(o.num.equals("K")){
				return 0;	
			}
			else{
				return 1;
			}
		}
		else if(this.num.equals("Q")){
			if(o.num.equals("A")||o.num.equals("K")){
				return -1;
			}
			else if(o.num.equals("Q")){
				return 0;
			}
			else{
				return 1;
			}
		}
		else if(this.num.equals("J")){
			if(o.num.equals("A")||o.num.equals("K")||o.num.equals("Q")){
				return -1;
			}
			else if(o.num.equals("J")){
				return 0;
			}
			else{
				return 1;
			}
		}
	}
	return 0;
}
}  

 