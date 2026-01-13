import java.util.Scanner;
	class interest{
	public static void main()
	{
		Scanner sc = new Scanner (System.in);
		double P,R,T,Sinterest;
		System.out.println("enter principle");
		P = sc.nextDouble();
		System.out.println("enter rate");
		R = sc.nextDouble();
	    System.out.println("enter time");
		T = sc.nextDouble();
		Sinterest = (P*R*T)/100;
	System.out.println("Sinterest="+Sinterest); }
	}
		
		