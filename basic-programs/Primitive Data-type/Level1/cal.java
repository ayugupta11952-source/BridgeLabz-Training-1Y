import java.util.*;
class cal{
	public static void main(){
	  double a,b,c,d,e,f;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter no.1:");
	  a = sc.nextDouble();
	  System.out.println("Enter no.2:");
	  b = sc.nextDouble();
	  c = a+b;
	  System.out.println("Addition:c="+c);
	  d = a-b;
	  System.out.println("Substraction:d="+d);
	  e = a*b;
	  System.out.println("Multiplication:e="+e);
	  f = a/b;
	  System.out.println("Division:f="+f);
	}
}