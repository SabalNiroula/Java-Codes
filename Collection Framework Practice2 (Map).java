import java.util.*;
public class Main {
	public static void main(String[] args) {
HashMap<String,Integer> hm = new HashMap<String,Integer>();

hm.put("Sabal", 1000);	
hm.put("Nitesh", 2000);
hm.put("Protsan", 3000);
hm.put("Yunisha", 5000);
hm.put("Rabin",4000 );

Set<Map.Entry<String,Integer>> set = hm.entrySet();

for(Map.Entry<String,Integer> me :set)
{
System.out.print(me.getKey()+": ");
System.out.println(me.getValue()+"");
	
}
System.out.println();
int balance;
balance = hm.get("Yunisha");
hm.put("Yunisha", balance+29374);

System.out.println("Yunisha's new Balance is : "+hm.get("Yunisha"));				
		
	}
}