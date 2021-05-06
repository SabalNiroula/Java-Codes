class twgen<I,S> {
I ob1;
S ob2;
	
 twgen( I o1,S o2){
 	ob1 = o1;
 	ob2 = o2;
 	}
 I getob1(){
 	return ob1;
 	}
 	
 S getob2(){
 	return ob2;
 	}
 	
 void showtype(){
 System.out.println("The type of I is "+ob1.getClass().getName());
System.out.println("The type of S is "+ob2.getClass().getName());
 	
	}							
}

public class Main {
	public static void main(String[] args) {

		
 twgen<Integer, String> tgen = new twgen<Integer, String>(100, "Today is sex with yunisha");
 tgen.showtype();
 int a = tgen.getob1();
 System.out.println("Ob1 : "+a);
 
  String b = tgen.getob2();
  StringBuffer sb = new StringBuffer (b);
 System.out.println("Ob2 : "+sb.reverse());								
	}
}