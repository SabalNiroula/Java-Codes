import java.util.*;
import java.io.*;

public class Main {
static int count=0;
	static int countm;	
	
static int digsum(int n,int len){
	
	if(count==len) return n;
	count++;
	
return (n%10)+digsum(n/10,len);
   }

      
static int digmul(int n,int len){
	
	if(countm==len-1) return n;
	countm++;
	
return (n%10)*digmul(n/10,len);
	
	}			
	
	public static void main(String[] args) throws IOException {

BufferedReader br=new BufferedReader (new InputStreamReader (System.in));

StringTokenizer st = new StringTokenizer (br.readLine());
String str=st.nextToken();

String dubstr=str;


if((digsum(Integer.parseInt(str),str.length()))==
digmul(Integer.parseInt(dubstr),str.length()))
{				
System.out.println("Spy Number");				
		}else {
System.out.println("Not Spy Number");								          }				
						
	}
}