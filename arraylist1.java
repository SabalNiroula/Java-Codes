import java.util.*;
public class Main {
	public static void main(String[] args) {
ArrayList<Integer> al = new ArrayList<Integer>( 8);
Object clonelist;
al.add(6);
al.add(7);
al.add(9);
Object arr[]= al.toArray();
for (Object x : arr )
System.out.println(x);
clonelist = al.clone();
int a = al.indexOf(6);
System.out.println(clonelist);	
	}
}