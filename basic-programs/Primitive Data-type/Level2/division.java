import java.util.Scanner;
class division{
	public static void main(){
		double a,b,c,d;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1st no.:");
		a = sc.nextDouble();
		System.out.println("Enter 2nd no.:");
		b = sc.nextDouble();
		c = a/b;
		System.out.println("Quotient:c="+c);
		d = a%b;
		System.out.println("Remainder:d="+d);
	}
}	
		