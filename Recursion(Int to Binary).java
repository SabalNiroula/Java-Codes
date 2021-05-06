public class Main {
	
static String binconvert(int n){
	if (n==1) return "1";
	
	return binconvert(n/2)+ (n%2);
	
	}
	public static void main(String[] args) {
	
int n = 6;
	
System.out.println(binconvert(n));		
	}
}