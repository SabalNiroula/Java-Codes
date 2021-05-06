import java.util.*;

class Mycomp implements Comparator <String>
{
	
public int compare(String a, String b){
	return a.compareTo(b);
	}	
}
public class Main {
	public static void main(String[] args) {

				
TreeSet<String> ts = new TreeSet<String> ((a,b)-> b.compareTo(a));
ts.add("A");
ts.add("B");
ts.add("D");
ts.add("C");
ts.add("F");
ts.add("E");
ts.add("G");

for(String s: ts)
System.out.print(s+" ");
		
	}
}