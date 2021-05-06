public class Main {
	public static void main(String[] args) {
		long fn_1 = 8;
		long fn_2= 2;
		long fn;
		long sum=0;
		long a = 10;
	do {
    fn = 4*fn_1+fn_2;	            fn_2 = fn_1;
	fn_1 = fn;
	System.out.print(fn+" ");
    	sum=sum+fn;
		} while (1000000>fn);
		System.out.println();
System.out.println("The sum is "+sum);
	}
}