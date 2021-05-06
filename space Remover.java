import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		
String str = "  Hello      this  is       sbl.            ";

StringTokenizer st = new StringTokenizer(str, " ");

StringBuffer sb = new StringBuffer();

while(st.hasMoreElements()){
  
 sb.append(st.nextElement()).append(" ");         
       
       }
     
System.out.println(sb.toString().trim());
				
	}
}