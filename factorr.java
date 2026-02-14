import java.util.*;
class factorr{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num = sc.nextInt();
		int i = 1;
	    while(i<num){
			if(num%i==0){
			System.out.println(i);}
		}
		
	}
}