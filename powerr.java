import java.util.*;
class powerr{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int a =sc.nextInt();

		System.out.println("Enter its power: ");
		
		int b =sc.nextInt();
	    int result = 1;
		
		int i =1;
		while(i<=b){
		result = result * a;
		i++;
		}
		
		System.out.println("result="+result);
	}
}
		