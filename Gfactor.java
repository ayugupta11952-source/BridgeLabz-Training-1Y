import java.util.*;
class Gfactor{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int g = 1;
		int i = 1;
		while(i<a){
			if(a%i==0){
			a=i;}
			i++;
		}
		System.out.println("Number:"+ a +"Greatest factor"+ g);
	}
}