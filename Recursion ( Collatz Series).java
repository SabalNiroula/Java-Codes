public class Main {
	
static void convert(int n){
	System.out.print(n+" ");
	if(n==1) return;
	
	if(n%2==0)
     convert(n/2);
	else convert(3*n+1);
	
	}	
	public static void main(String[] args) {
		convert(10);
	System.out.println("");	
	}
}