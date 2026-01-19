import java.util.*;
class trianglee{
	public static void main(){
		float a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base: ");
		a = sc.nextFloat();
		System.out.println("Enter Height: ");
		b = sc.nextFloat();
		c = 1/2*a*b;
		System.out.println("Area:c=cm"+c);
		d = c*2.54;
		System.out.println("Area:d=inch"+d);
		e = d*12;
		System.out.println("Area:e=foot"+e);
	}
}