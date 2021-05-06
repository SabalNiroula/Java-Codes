import java.util.*;
public class Main {
	public static void main(String[] args) {
		
int a[]={10,739,929,729,8292,626,6362,54,545,627,585,72,737,52,83,01};

Arrays.sort(a);

int item =737;
int li=0;
int hi = a.length-1;
int mid=(li+hi)/2;

while (hi>=li){
	
if(a[mid]==item){
	System.out.println(item+" is in index : "+mid);
	break;
	}	
	else if(a[mid]<item){
		li=mid+1;
	}else{
		hi =mid-1;
	}
	mid=(li+hi)/2;	
	
	if(li>hi){
		System.out.println("Element not found");
	}
}
				
	}
}