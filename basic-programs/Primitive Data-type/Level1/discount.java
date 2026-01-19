import java.util.*;
class discount{
	public static void main(){
		int fee = 125000;
		int discountpercent = 10;
		double discount,finalfee;
		discount = (fee * 0.1);
		System.out.println("Discount,discount="+discount);
		finalfee = (fee - discount);
		System.out.print("Finalfee,finalfee="+finalfee);
	}
}