import java.util.function.Predicate;
public class Main {
	public static void main(String[] args) {
String s[] = { "sabal","Nitesh","yunisha","rabin","protsan"
	     	};	
	   
Predicate<String> ps = s1 -> s1.length() >5;

for( String gs:s)
      {
     	if(ps.test(gs))
     	{
     System.out.print(gs+" ");       	 } 		
      }	   	   
   }
}