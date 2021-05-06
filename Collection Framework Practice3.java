import java.util.*;
class mycomp implements Comparator<String>
{
	public int compare(String a,String b)
	{
	int i,j,k;
	i = a.lastIndexOf(" ");
	j = b.lastIndexOf(" ");
	
k = a.substring(i).compareToIgnoreCase(b.substring(j));
if(k==0)
return a.compareToIgnoreCase(b);else return k;			
	}
	
}
public class Main {
	public static void main(String[] args) {

TreeMap<String,Integer> hm = new TreeMap<String,Integer>(new mycomp());

hm.put("Nitesh Gautam",737 );
hm.put("Sabal Niroula",7353 );
hm.put("Yunisha Phuyal",5373 );
hm.put("Sushant Singh Rajput",4294 );
hm.put("Protsan Karki", 6363);
hm.put("Rabin Acharya", 6373);
hm.put("Rabin Acharya", 6373);

Set<Map.Entry<String,Integer>> set = hm.entrySet();			

for(Map.Entry<String,Integer> me : set) {
System.out.print(me.getKey()+" ");	
								System.out.println(me.getValue()+"");	
}	}
}