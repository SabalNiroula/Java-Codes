class Gen<I>{
	I ob;
	
  Gen(I o) {
  	ob = o;
  }
  I getob() {
  	return ob;
  }
  void showtype() {
  	System.out.println("The type of I is "+ob.getClass().getName());
  }
}

public class Main {
	public static void main(String[] args) {
	
Gen<Integer> iob = new Gen<Integer>(30);

int v = iob.getob();
iob.showtype();

System.out.println("Gen Integer is "+v);
System.out.println();

Gen<String> strob = new Gen<String>("Madarchot");
String a = strob.getob();
strob.showtype();
System.out.println("Gen String is "+a);
	
	}
}