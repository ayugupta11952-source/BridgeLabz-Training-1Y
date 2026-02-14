import java.util.*;
class devide{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		double n;
		n = sc.nextDouble();
		if(n%5 == 0){
			System.out.println("This no. is Divisible by 5");
		}
		else{
			System.out.println("This no. is not Divisible by 5");
		}
	}
}