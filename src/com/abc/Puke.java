package com.abc;

public class Puke implements Comparable<Puke>{
      public String color;//牌的颜色
      public String num;//牌的点数
   public Puke(String coloir,String num, String color){
	   this.color=color;
	   this.num=num;
	   
   }
   /*
    * 定义牌的规则
    */
@Override
public int compareTo(Puke o) {
	// TODO Auto-generated method stub
	if(this.num==o.num){
		if(this.color.equals("黑桃")){
			if(o.color.equals("黑桃")){
				return 0;
			}
			else{
				return 1;
			}					
		}
		else if(this.color.equals("红桃")){
			if(o.color.equals("黑桃")){
				return -1;
			}
			else if(o.color.equals("红桃")){
			    return 0;
			}
			else{
				return 1;
			}
		}
		else if(this.color.equals("梅花")){
			if(o.color.equals("黑桃")||o.color.equals("红桃")){
				return -1;
			}
			else if(o.color.equals("梅花")){
				return 0;
			}
			else{
				return 1;
			}
		}
		else if(o.color.equals("方片")){
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

 