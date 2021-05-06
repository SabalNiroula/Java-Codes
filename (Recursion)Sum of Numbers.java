import java.io.*;
public class Main {
	
static int count =0;
	
static int sumn (int n,int len){
	
if(count==len) return n;
count++;

return (n%10)+sumn(n/10,len);
	}
	
	public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader (new InputStreamReader(System.in));


String s = (String)br.readLine();

int n = sumn(Integer.parseInt(s),s.length());
System.out.println(n);				
						
	}
}