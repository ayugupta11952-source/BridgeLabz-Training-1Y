import java.util.*;
class Fizzbuzzz{
	public static void main(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a positive integer: ");
		
		int n =sc.nextInt();
		
		if(n<=0) {
		System.out.println("Enter a positive integer: ");
		}else{
			int i=1;
			while(i<=n){
			
				if(i%3==0 && i%5==0) {
					System.out.println("FizzBuzz");
				}else if(i%3==0){
					System.out.println("Fizz");
				}else if(i%5==0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
				i++;
			}
		}
	}
}