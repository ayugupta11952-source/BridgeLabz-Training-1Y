import java.util.*;
class feeet{
	public static void main(){
		double a,b,c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Distance:");
		a = sc.nextDouble();
		b = a*1/3;
		System.out.println("Distance in yard:b="+b);
		c = b*1/1760;
		System.out.println("Distance in mile:c="+c);
	}
}