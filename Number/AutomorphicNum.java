/*
A number is Automorphic when the square of it ends with the same number.
eg  5-> 5*5-> 25
ends with 5 
so Automorphic Number.
*/

public class Main {
	public static void main(String[] args) {
	
int number = 125;
String st =String.valueOf(number);

int length=st.length();
String str="";

int squareit=(int)Math.pow(number,2);
int res=0;
int rev=0; 														
while(squareit!=0){
	
res = squareit%10;	
rev = rev*10+res;
squareit/=10;
		
	}
	
	StringBuffer sb=new StringBuffer(st);
	
	str=String.valueOf(rev);
	sb.reverse();
		
	if(str.substring(0,length).equals(sb.toString())){
		
		System.out.println("Automorphic Number");
		
		}else{
			
	System.out.println("Not Automorphic Number");							
	  }		
	}
}