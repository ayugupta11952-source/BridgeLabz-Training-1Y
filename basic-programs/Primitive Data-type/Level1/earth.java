import java.util.*;
class earth{
	public static void main(){
		double v,r,x;
		r = 6378;
	    v = (4/3)*3.14*r*r*r;
		System.out.println("volume of earth in km:v="+v);
		x = v*1.6*1.6*1.6;
		System.out.print("volume of earth in miles:x="+x);
	}
}