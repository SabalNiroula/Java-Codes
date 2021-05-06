import java.util.*;
public class Main {
	
		static String
	 translate(String s) {
String latin="";
String vowel = "aeiouAEIOU";	 	for (int i =s.length()-1;i>=0;i--)
{
	latin = s.substring(1)+ s.charAt(0)+"ay";
}
return latin;	 	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String str= sc.nextLine();
 String[] strarr = str.split(" ");
	for (String s : strarr) {
	String rec = translate(s);
	System.out.print(rec+ " ");
	   }	
	}
}