import java.util.Random;
public class Main
 {
 	
public static void generateR1()
{
	int otp = (int)(Math.random()*9000)+ 1000;
	System.out.println("Approach 1 : "+otp);	
	
 }
 
 public static void generateR2(int lengthofotp)
	{
	 char [] ch = new char[lengthofotp];
	 String sno = "0123456789";
	 Random r = new Random();

for(int i = 0;i<ch.length;i++){

	 int rno = r.nextInt(sno.length());
	 ch[i] = sno.charAt(rno);
	 }	 	 
	 System.out.println("Approach 2 : "+new String(ch));
 }
  
  	public static void main(String[] args)
	 {
		
		generateR1();
		generateR2(4);
	}
}