import java.util.*;
class Employee{
	int eno;
	String name;
Employee (String name,int eno)
 {
this.name=name;
this.eno = eno;	
 }
 public  String toString(){
 return name+" "+eno;
 }
}
public class Main {
	public static void main(String[] args) {
	
ArrayList<Employee> al = new ArrayList<Employee>();

al.add(new Employee("protsan",10));al.add(new Employee("yuni",730));al.add(new Employee("nites",370));
al.add(new Employee("sushant",50));		
System.out.println(al);

Collections.sort(al,(e1,e2)-> (e1.eno<e2.eno)? 1:(e1.eno>e2.eno)? -1:0 );
System.out.println("\nNumber order Sort");
System.out.println(al);		

Collections.sort(al,(e1,e2)-> e1.name.compareTo(e2.name));

System.out.println("\nNaming order Sort");
System.out.println(al);																
	}
}