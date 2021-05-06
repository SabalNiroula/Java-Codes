import java.util.*;
public class Main {
	
static int GetNum(int n){

int upperlimit = 0;
for(int i=1;i<=n;i++){
	upperlimit*=10;
	upperlimit+=9;
	}	
	
int lowerlimit = (1+upperlimit)/10;			
int maxproduct = 0;
int product;

for(int i = upperlimit;i>=lowerlimit;i--){
for(int j = i; j>=lowerlimit;j--){
    product = i*j;
   if (maxproduct>product)
   break;
   
   int number = product;
   int reverse =0;
   
   while (number!=0){
    reverse = reverse*10 + number%10;
    number/=10;	
  }
  
if (reverse==product && product > maxproduct)
      maxproduct = product;
    }    
  }
 return maxproduct;			
}
	
	public static void main(String[] args) {
	
	int n = 3;	
	System.out.println(GetNum(n));							
	}
}