import java.util.*;
class small{
	public static void main(){
		Scanner sc = new Scanner (System.in);
		double a,b,c;
		System.out.println("Enter 3 no.");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if(a<b && a<c){
			System.out.println("First no. smallest");
		}
		else{
			System.out.println("First no. is not smallest");
		}
	}
}
			