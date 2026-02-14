import java.util.*;
class multiple{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. below 100: ");
		int a =sc.nextInt();
		for(int i =0;i<100;i++){
			if(i%a==0){
				System.out.println(i);
			}
		}
	}
}