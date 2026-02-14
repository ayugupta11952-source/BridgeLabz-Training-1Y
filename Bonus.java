import java.util.*;
class Bonus{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		double s;
		int y;
		System.out.println("Enter your salary: ");
		s =sc.nextDouble();
		System.out.println("Enter years of service: ");
		y =sc.nextInt();
		
		if(y>5){
			double u = (0.05*s)+s;
			System.out.println("Bonus amt.:"+u);
		}
		else{
			System.out.println("No Bonus");
		}
	}
}
			