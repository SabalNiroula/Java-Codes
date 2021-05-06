import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
Set<Integer> st = new HashSet<>();
int a[] = {1,2,53,-2,-4,3 };
boolean found = false;

// This is the sum we want to find.
//int k = 73;

int sum =0;
for(int x : a)
{

	st.add(sum);
	sum+=x;
if(st.contains(sum))

/* 
To find if the kth sum lies in the set or not
*/

// if(st.contains(sum-k))

      {		
							       	found = true;				  }	
		
}
		
System.out.println("Found = "+found);										
		
	}
}