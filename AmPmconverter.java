import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Time In AM or PM ");
		String s = sc.nextLine();
	boolean d =s.endsWith("PM");
	if(d) {
	 s =s.replaceAll("PM","");
    s =s.replace(":", "");
    s = s.replace(" ","");
 
   Integer a = Integer.parseInt(s);
   a = a+1200;
   String e = String.valueOf(a);
 boolean y = e.startsWith("24");
  if (y) {
 String re = e.replace("24","00");
  	  System.out.print(re.substring(0,2));
   System.out.print(" : "+e.substring(2));
  }else {
   System.out.print(e.substring(0,2));
   System.out.print(" : "+e.substring(2));
  }
	} else{ 
	s =s.replaceAll("AM","");
    s =s.replace(":", "");
    s = s.replace(" ","");
    Integer a = Integer.parseInt(s);
    
    if (a>1000) {
    String e = String.valueOf(a);
   System.out.print(e.substring(0,2));
   System.out.print(" : "+e.substring(2));
    } else {        	String e = String.valueOf(a);
   	System.out.print(e.substring(0,1));
   	System.out.print(" : "+e.substring(1));
           }
   	}
	}
}