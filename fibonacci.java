import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a Nth term of fibonacci ");
	int d = sc.nextInt();	
	int a = 0;
	int b=1;
	int e = d-1;
	
	for ( int i = 1;d>=i;++i)
	{
	int c = a+b; 
	a = b;
	b=c;
	
	if ( i == e-1) {
	System.out.println(c+" is last element"); }
		 }	
	}
}