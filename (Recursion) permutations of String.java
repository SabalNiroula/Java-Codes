import java.util.*;
public class Main {
	
static Set<String> hs = new HashSet <String> (); 
	
static int countperm = 0;
			
	public static void main(String[] args) {
		
String a ="yunisbl";
permutations(a,0,a.length()-1);
System.out.println(countperm);
 						
}
	
public static void permutations(String s,int l,int r){
		
	if(l == r)
    {
	if(hs.contains(s)) return;
	
		hs.add(s);
		System.out.println(s);
		countperm++;
		return;
}	

for(int i=l;i<=r;i++)
   {
	s = interchange (s,l,i);
	permutations (s,l+1,r);
	s = interchange (s,l,i);	
	}			
}	
static String interchange(String s,int a,int b){
	char[]arr = s.toCharArray();
	char temp = arr[a];
	arr[a] = arr[b];
	arr[b]= temp;
	
	return String.valueOf(arr);	
  }
 	
}