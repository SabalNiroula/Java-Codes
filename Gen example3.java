class number<N extends Number>{
N [] arr;
	
number( N[] a ){
	arr = a;
	}
		
 double avgsum(){
 	double sum = 0.0;
 for(int i = 0; i<arr.length;i++) sum+=arr[i].doubleValue();
 
 	return sum/arr.length;	
 }
 
boolean sameavg(number<?> ob){
	if (avgsum() == ob.avgsum())
	return true;
	else return false;
}
}


public class Main {
	public static void main(String[] args) {
	double a,b;
	
Integer [] inums = {1,2,3,4,5,6,7,8,9,10};		
number<Integer> in = new number<Integer>(inums);

a = in.avgsum();
System.out.println("Avg of int is "+a);

Double[] dnums = { 1.0,2.0,3.0,4.0,5.0,6.5,7.0,8.5,9.0,10.0};

number<Double> id = new number<Double>(dnums);			
b = id.avgsum();
System.out.println("Avg of double is "+b);

Float[] fnums = { 1.0F,2.0F,3.0F,4.0F,5.0F,6.5F,7.0F,8.5F,9.0F,10.0F };

number<Float> ifn = new number<Float>(fnums);

double c = ifn.avgsum();
System.out.println("Avg of float is "+c);			

System.out.print("Integer and Double are ");

if(in.sameavg(id))
System.out.println("Are same");
else System.out.println("differ");

System.out.print("Float and Double are ");
if(ifn.sameavg(id))
System.out.println("Are same");
else System.out.println("differ");
	}
}