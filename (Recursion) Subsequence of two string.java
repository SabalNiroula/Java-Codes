public class Main {
	
public static boolean issubsequence(String str1,String str2,int m,int n){
	
	if(m==0) 
	return true;
	
	if(n==0) 
	return false;
	
if(str1.charAt(m-1)==str2.charAt(n-1))
 
return issubsequence (str1,str2,m-1,n-1);

return issubsequence (str1,str2,m,n-1);
	
	}	
	
	public static void main(String[] args) {

String str1 = "bal";
String str2 = "sabal";		

int m = str1.length();		int n = str2.length();		

boolean result = issubsequence (str1,str2,m,n);

																if(result){
								System.out.println("Subsequence");	
										} else
										 {
System.out.println("Not Subsequence");	
        }								
	}
} 