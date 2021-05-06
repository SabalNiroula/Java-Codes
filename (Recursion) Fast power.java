import java.math.*;
public class Main {
	
static long fastpow(long a,long b){
	
	if(b==0) {
	return 1;
	
	}  else if(b%2==0) {
		
	return fastpow(a*a,b/2);
	
	} else
	return a * fastpow(a,b-1);
		
}
	public static void main(String[] args) {
			
		System.out.println(fastpow(5,2));
	}
}