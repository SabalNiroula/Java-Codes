import java.util.Calendar;
public class Main {
	public static void main(String[] args) {
	String months[]= { 
	"January", "February","march" ,"april", "may" ,"June" ,"July" ,"August", "September" ,"October" ,"November", "December" };
Calendar cdr =  Calendar.getInstance();

	//For getting month	
 System.out.println(" Date: ");    System.out.print(cdr.get(Calendar.DATE));
System.out.print(" "+months[cdr.get(Calendar.MONTH)]);
 System.out.println(" "+cdr.get(Calendar.YEAR)+"");

  // For getting Time
 System.out.println(" Time: ");
 System.out.print(""+cdr.get(Calendar.HOUR));
System.out.print(":"+cdr.get(Calendar.MINUTE));
 System.out.println(":"+cdr.get(Calendar.SECOND)+"");
 
 //Lets update time
 cdr.set(Calendar.HOUR,24);
 cdr.set(Calendar.MINUTE,20);
 cdr.set(Calendar.SECOND,0);
 
System.out.println(" Time: ");
 System.out.print(""+cdr.get(Calendar.HOUR));
System.out.print(":"+cdr.get(Calendar.MINUTE));
 System.out.print(":"+cdr.get(Calendar.SECOND)+"");		
	}
}