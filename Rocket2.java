import java.util.*;
class Rocket2{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter countdown start no.: ");
		int count=sc.nextInt();
		
		for(int i=count;i>=1;i--){
			System.out.println(i);
		}
	}
}