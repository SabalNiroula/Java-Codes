import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a number ") ;
long a = sc.nextLong();
	String s = String.valueOf(a);//  INTEGER CONVERT INTO STRING 
	char [ ] c = s.toCharArray(); // STRING CONVERT INTO CHAR 
	int b = s.length(); // LENGTH OF S
	char d = s.charAt(b-1); //GET CHAR AT LAST
char e = s.charAt(0); // GET CHAR AT FIRST 

int g =Integer.parseInt(String.valueOf(d));
int h=Integer.parseInt(String.valueOf(e));
// CONVERT CHARACTER INTO INTEGER
int f = (g+h);
// ADD THEM

if (a%f == 0 )
{
	System.out.println( a + "/" + f + " = 0 .");
	System.out.println("It is divisible .") ;
} else 
	{
	System.out.println( a + "/" + f + " != 0 .");
	System.out.println("It is not divisible .");
			}	
	}
}