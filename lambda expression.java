interface Somefunc<T> {
	T func(T a);
}
public class Main {
	public static void main(String[] args) {
	
Somefunc<String> strrev =(str) -> {
String result = "";
for(int i = str.length()-1;i>=0;i--)
result +=str.charAt(i);

return result;

	};
Somefunc<Integer> iob = (a)->{
int result = 1;

for(int i = 1;a>=i;i++)
result*=i;
return result;													};	

System.out.println("reversed of sabal is "+strrev.func("sabal"));								System.out.println("factorial of 10 is "+iob.func(10));				
  }
}