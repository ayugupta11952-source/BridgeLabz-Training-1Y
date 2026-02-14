import java.util.*;
class frnd{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ages: ");
		int a,b,c;
		double x,y,z;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter Heights: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(b<a && b<c){
		System.out.println("2nd is Youngest");}
		else if(a<b && a<c){
		System.out.println("1st is Youngest");}
		else if(c<a && c<b){
		System.out.println("3rd is Youngest");}
		  
		if(x>y && x>z){
		System.out.println("1st is Tallest");}
		else if(y>x && y>z){
		System.out.println("2nd is Tallest");}
		else if(z>x && z>y){
		System.out.println("3rd is Tallest");}
	}
}
			