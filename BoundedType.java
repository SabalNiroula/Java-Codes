class Gen <G extends Number>
{
	G t [ ];
	Gen (G[] a){
	t = a;
}
double display( )
      {
  double sum = 0.0;
 for (int i = 0; i < t.length; i++)
 
 	sum +=t[i].doubleValue();
 	return sum/t.length;
  
       }
}
 
   class Hello {
	public static void main(String[] args) {
		 Integer num1[ ] = { 10,20,40,60, 80};
		 Gen <Integer> ob1= new Gen <Integer> (num1);
		 double a = ob1.display();
		 System.out.println(" Average of Integer is  "+a);
		 
		 Double num2 [] = {10.2,30.39,73.92,739.73,728.72};
		 Gen <Double> ob2= new Gen <Double> (num2);
		 Double b = ob2.display ();
		  System.out.println(" Average of Double is "+b);
	}
}