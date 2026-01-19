import java.util.*;
class fee{
	public static void main(){
		double a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fee:");
		a = sc.nextDouble();
		System.out.println("Enter Discount:");
		b = sc.nextDouble();
		c = a*(b/100);
		System.out.println("Discount Amount:c="+c);
		d = a-c;
	    System.out.println("Discount Fee:d="+d);}
}