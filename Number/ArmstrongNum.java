public class Main {
	public static void main(String[] args) {

int n=153;
int k = n;
int res;						int sum=0;		
while(n!=0){
	
res = n%10;
sum=sum+(int)Math.pow(res,3);
n=n/10;
}
	
if(sum==k){
	
System.out.println("Armstrong Number");
	
	}else{
		
	System.out.println("Not Armstrong Number");	
		}				
	}
}