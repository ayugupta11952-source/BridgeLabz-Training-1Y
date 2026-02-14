import java.util.*;
class factor{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num = sc.nextInt();
		for(int i = 1;i<num;i++){
			if(num%i==0){
			System.out.println(i);}
		}
	}
}