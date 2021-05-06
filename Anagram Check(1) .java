import java.util.*;
public class Main {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);		
	String astr =sc.nextInt();
	String bstr = sc.nextInt();
	
boolean visited[]= new boolean[astr.length()];

boolean isanagram = true;
	
for(int i=0;i<astr.length();i++){
    char c = astr.charAt(i);
    isanagram = false;
for(int j=0;j<bstr.length();j++){
  	
  	if(bstr.charAt(j)==c && !visited[j]){
  		isanagram=true;
  	visited[j]=true;
  		break;
     	}	
  	}
  if(!isanagram){
     	break;
   	}		
  }

 	if(isanagram){
 System.out.println("Anagram");}else {System.out.println("Not Anagram");
 }	
	}
}