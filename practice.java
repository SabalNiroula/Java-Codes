import java.util.*;
public class Main {
	public static void main(String[] args) {
Random r = new Random ();
Scanner sc = new Scanner (System.in);
System.out.print("Enter length of OTP : ");
int input = sc.nextInt();

String str = "1234567890";
for(int i=0;i<input;i++)
{
int a = r.nextInt(str.length());
System.out.print(str.charAt(a)+"");		
		}		
		
	}
}