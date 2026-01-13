import java.util.Scanner;
class average{
	public static void main(){
		Scanner sc = new Scanner (System.in);
		double a,b,c,Avg;
		System.out.println("a");
		a = sc.nextDouble();
		System.out.println("b");
		b = sc.nextDouble();
		System.out.println("c");
		c = sc.nextDouble();
		Avg = (a+b+c)/3;
	System.out.println("Avg="+Avg);}
}