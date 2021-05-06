interface Mynumber{
	boolean test(int n);
}
interface Hello{
	boolean find(int a, int b);
}
public class Main {
	public static void main(String[] args) {
	Mynumber mynum = (n) -> (n%2 == 0);
	
	if(mynum.test(10)) System.out.println("10 is Even");
	
		if(!mynum.test(9)) System.out.println("9 is odd");	
		Mynumber isnumeric = (n) -> (n>=0);
		
	if (isnumeric.test(1)) System.out.println("1 is non negative");
	
	if (!isnumeric.test(-1)) System.out.println("-1 is negative");	
	
 Hello h = (a,b)-> (a%b ==0);
 if (h.find(10,2)) System.out.println("2 is factor of 10 ");
 
 if (!h.find(10,3)) System.out.println("3 is not factor of 10 ");
	}
}