import java.util.*;
public class Main {
	public static void main(String[] args) {

int arr[] ={1,2,4,5,2,8,5,2,6,3,5,4,5,2,2,1,8};		
						
Map<Integer,Integer> hm = new HashMap<>();		
	
for(int no:arr){
	
	Integer get = hm.get(no);
	if(get==null){
		hm.put(no,1);
	}else{
		get=get+1;
		hm.put(no,get);
	}
}

Set<Map.Entry<Integer,Integer>> set = hm.entrySet();

for(Map.Entry<Integer,Integer> me :set){
	
if(me.getValue()>1){
	System.out.print(me.getKey()+ " ");
	}	
	
}
						
	}
}