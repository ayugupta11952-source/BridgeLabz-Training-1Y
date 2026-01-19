import java.util.*;
class height{
	public static void main(){
		double a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height: ");
		a = sc.nextDouble();
		b = a*2.54;
		System.out.println("Your height in inches: b="+b);
		c = b*12;
	    System.out.println("Your height in foot: c="+c);
		}
}