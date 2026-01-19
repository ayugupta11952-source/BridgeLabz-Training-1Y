import java.util.*;
class hand{
	public static void main(){
		int n,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no. of hands:");
		n = sc.nextInt();
		b = (n*(n-1))/2;
		System.out.println("No. of handshakes:b="+b);
	}
}