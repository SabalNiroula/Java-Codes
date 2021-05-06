
public class Main {
	public static void main(String[] args) {
		
int check = 90;
int squareit = (int)Math.pow(check,2);
int res;
int sum=0;

while(squareit!=0){
		
res=squareit%10;		
sum = sum+res;
squareit=squareit/10;
		
		}
	if(check==sum){
	System.out.println("Neon Number");	  
	    }else{
System.out.println("Not Neon Number");	    	
	    	}					
	}
}