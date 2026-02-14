import java.util.*;
class number{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.:");
		int n,a,b;
		n = sc.nextInt();
		for(int i=0;i<=n;i++){
			if(i%2==0){
			System.out.println("even: "+i);}
		}
		for(int i=0;i<=n;i++){
			if(i%2!=0){
			System.out.println("odd: "+i);}
		}
	}
	}
