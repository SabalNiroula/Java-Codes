

public class Main {
	
			static Long receive(Long num){
		long maxprime = -3;
		while (num%2==0)
		{
			maxprime = 2;
			num=num/2;
		}
		
	for (int i=3;i<=Math.sqrt(num);i+=2){
		while (num%i==0){
			maxprime=i;
			num=num/i;
		}
		
	}
	
	if (num>2)
	maxprime = num;
		return maxprime;
}
		
				
	
	public static void main(String[] args) {
		
	Long l = 600851475143l;

long a = receive(l);
	System.out.println(a);
	System.out.println(receive (75l));
		
	}
}// 600851475143