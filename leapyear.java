import java.util.*;
class leapyear{
	public static void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year: ");
	
	int a =sc.nextInt();
	
	if(a%4==0){
		System.out.println("This is a leap year");
	}
	else{
		System.out.println("This is not a leap year");
	}
}
}
	