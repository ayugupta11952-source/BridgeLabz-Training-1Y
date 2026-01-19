import java.util.*;
class oper{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f,g;
		System.out.println("Enter a,b,c:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = a+b*c; e = a*b+c;
		f = c+a/b; g = a%b+c;
		System.out.println("a+b*c:d="+d);
		System.out.println("a*b+c:e="+e);
		System.out.println("c+a/b:f="+f);
		System.out.println("a%b+c:g="+g);
	}
}