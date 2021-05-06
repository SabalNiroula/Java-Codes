public class Main {
	public static void main(String[] args) {
	
int n=3;
int k=n;
System.out.println("P A T T E R N\n");

for(int i=1;i<=n+1;i++){
	
	for(int j =1;j<=n-i+1;j++){
		System.out.print("  ");
		}
	for(int j=1;j<=n-k+1;j++){
		System.out.print(j+" ");
		}
		k--;	
System.out.println();			
		}				
k=n;			
for(int i=1;i<=n;i++){
   
   for(int j=1;j<=n-k+1;j++){
   	System.out.print("  " + 
   	                 "");
   	
   	}		
	for(int j=1;j<=n-i+1;j++){
		System.out.print(j+" ");
		}
		System.out.println();
		k--;	
		}				
						
	}
}