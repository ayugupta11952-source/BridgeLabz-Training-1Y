import java.util.*;
class vote{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your age: ");
		int age;
		age = sc.nextInt();
		if(age >18){
			System.out.println("You can vote");
		}
		else{
			System.out.println("You can n ot vote");
		}
	}
}