import java.util.*;
public class Main {

static boolean partition(int a[],sum,int i,ArrayList<Integer>ans){
	
//IF INDEX(I) IS OUT OF RANGE OR SUM BECOMES LESS THEN 0WE KNOW THERE IS NO POSSIBLE ANSWER

	if(i>=a.length||sum<0) return false;
//IF SUM BECOMES 0 THEN WE KNOW THERE IS A SOLUTION	
	if(sum==0) return true;
	
	ans.add(a[i]);
	
boolean left = partition(a,sum-a[i],i+1,ans);

if(left) return true;

// THIS IS BACKTRACKING
ans.remove(a.size()-1);

return partition(a,sum,i+1,ans);

}			
	
	public static void main(String[] args) {

ArrayList<Integer> ans = new ArrayList<>();
int sum = 0;				
int a[] = {2,1,3,4,2,8};

for(int i=0;i<a.length;i++)
	sum+=a[i];

boolean possible = (sum&1)==0 && partition(a,sum/2,0,ans);
	}
}