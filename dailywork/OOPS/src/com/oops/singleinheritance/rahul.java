package com.oops.singleinheritance;

public class rahul extends Student {
	
	
void disp()
{
	rollnumber=111;name="rahul";marks=444;
	System.out.println(rollnumber+" "+name+" "+marks+" ");
	
}
public static void main(String []args) {
	rahul r = new rahul();
	r.input();
	r.disp();
}


}