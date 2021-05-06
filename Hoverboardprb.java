import java.util.*;
public class Main {
	public static void main(String[] args) {
		int profit;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many Hoverboard did you want ? ");
	int a= sc.nextInt();
	int sp = 3000000 * a;
	int cp = 2000000 * 10;
	int insurance =  1000000;
	 profit = sp-cp;
	profit = profit - insurance;if (profit>0) {
		System.out.println("Profit");
		} else System.out.println("Loss");	
	}
}