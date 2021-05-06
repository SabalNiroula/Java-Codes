import java.io.*;
public class Main {
	
static StringBuffer sb;
	
static boolean checkpalin(String s){
	
String revpalin = ispalin(s,s.length()-1);
if(revpalin.equals(s)){ 
return true;
}
else {
return false;
 }		
}
	
// Reverses	
static String ispalin(String s,int len){

if(len<=0) return ""+ s.charAt(0);

return s.charAt(len)+""+ispalin(s,len-1);

}

	public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				
String s= br.readLine();

if (checkpalin(s)){
		
System.out.println("Palindrome");
		}else{
System.out.println("Not Palindrome");
			
		}				
		
	}
}