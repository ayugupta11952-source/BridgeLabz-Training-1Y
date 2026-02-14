import java.util.*;
class Largest {
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 no.");
		double a,b,c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (a>b && a>c){
			System.out.println("First no. is largest");
		}
		else if(b>a && b>c) {
			System.out.println("Second no. is largest");
		}
		else {
			System.out.println("Third no. is largest");
		}
	}
}