import java.util.*;
public class Main {
	public static void main(String[] args) {
		int sum = 0;
	ArrayList <Integer> al = new ArrayList <Integer>();
	System.out.println("Capacity before initialization : "+al.size());
	al.add( 32);
	al.add(63 );
	al.add( 74);
	al.add(70 );
	al.add(3, 50);	
	Integer ia[]= new Integer[al.size()] ;
	ia = al.toArray(ia);
	for (int i : ia) sum+=i;
	System.out.println("Elements of al : "+al);		
	System.out.println("Capacity After initialization : "+al.size());
	al.remove(1);
	al.remove(3);
System.out.println("Elements of al : "+al);	
System.out.println("Capacity After Removal  : "+al.size());
System.out.println("Sum of Arrays is "+sum);
	}
}