/*
Any number is a strong number if its digits factorial is equal to the number
like: 145 = 1!+4!+5!=145
So 145 is Strong Number.
*/

public class Main {
	
static int factorial(int n){
	if (n==1||n==0)
	return 1;
	
	return n*factorial(n-1);
	}	
	
	public static void main(String[] args) {
	
int check = 131;
int dublicate=check;
int res;
int sum=0;
		
while(check!=0){
	
res = check%10;
sum = sum+ factorial(res);
check = check/10;	
	}	

if(sum==dublicate){
	System.out.println("Strong Number");
	}else{
	System.out.println("Not Strong Number");	
		}		
	}
} 