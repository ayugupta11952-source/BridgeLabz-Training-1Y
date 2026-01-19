import java.util.*;
class operation{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f,g;
		System.out.prDoubleln("Enter a,b,c:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = a+b*c; e = a*b+c;
		f = c+a/b; g = a%b+c;
		System.out.prDoubleln("a+b*c:d="+d);
		System.out.prDoubleln("a*b+c:e="+e);
		System.out.prDoubleln("c+a/b:f="+f);
		System.out.prDoubleln("a%b+c:g="+g);
	}
}