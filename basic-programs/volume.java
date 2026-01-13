import java.util.Scanner;
class volume{
	public static void main()
	{
		Scanner sc = new Scanner (System.in);
		double r,h,Area;
		System.out.println("enter the radius");
	    System.out.println("enter the height");
		r = sc.nextDouble();
		h = sc.nextDouble();
		Area = r * r * h * 3.14;
	    System.out.println("Area="+Area);
	}
}