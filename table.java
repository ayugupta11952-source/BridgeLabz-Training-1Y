import java.util.*;
class table{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int a;
		a = sc.nextInt();
		for(int i=6;i<=9;i++){
			System.out.println(a + "x" + i + "=" +(a*i));
		}
	}
}
			