import java.util.*;
class power{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int a =sc.nextInt();
		System.out.println("Enter its power: ");
		
		int b =sc.nextInt();
	    int result = 1;
		
		for(int i =1;i<=b;i++){
		result = result * a;
		}
		
		System.out.println("result="+result);
	}
}
		