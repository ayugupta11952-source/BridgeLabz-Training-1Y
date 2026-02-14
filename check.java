import java.util.*;
class check{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		double n;
		System.out.println("Enter a no.: ");
		n = sc.nextDouble();
		if (n<0){
			System.out.println("Negative");
		}
		else if (n==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Positive");
		}
	}
}