import java.util.*;
class natural{
	public static void main(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a no. ");
		int n,sum;
		n = sc.nextInt();
		sum = n *(n+1)/2;
		if (n>0){
			System.out.println("Natural no.");
			
		System.out.println("Its sum:sum="+sum);
		}
		else {
			System.out.println("Not a Natural no.");
		}
		
	}
}