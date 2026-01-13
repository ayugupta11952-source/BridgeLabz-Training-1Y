import java.util.Scanner;
class perimeter{
	public static void main()
	{
		Scanner sc = new Scanner(System.in);
        double a,b,P;
        System.out.println("length");
        a = sc.nextDouble();
        System.out.println("breadth");
        b = sc.nextDouble();
        P = 2 * (a+b);
	System.out.println("P="+P);}
}