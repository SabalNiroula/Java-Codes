
import java.util.*;
public class Main {
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
String a = sc.nextLine();
String b= sc.nextLine();

int al [] = new int[256];

boolean isanagram = true;

for(char c : a.toCharArray())
    {

 int index =(int)c;
 al[index]++;	
	}
for(char c : b.toCharArray())
    {

 int index =(int)c;
 al[index]--;	
	}
	
for(int i=0;i<256;i++){
	if(al[i] != 0)
	{
	isanagram = false;
	break;	
	}
	}								if(isanagram) {
		System.out.println("\nAnagram");
	}else 
	    {
	  System.out.println("\nNot Anagram");  	
		}											
	}
}