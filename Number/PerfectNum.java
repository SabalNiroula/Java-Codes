public class Main {
	public static void main(String[] args) {

int n = 8;
int multiply=1;
for(int i=2;i<n;i++){
								    	if(n%i==0){
	multiply+=i;						  }					 	}								  if(multiply==n){
	System.out.println("Perfect Number");						}else{
	System.out.println("Not Perfect Number");	
	}					
	}
}