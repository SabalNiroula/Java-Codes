import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

StringTokenizer st = new StringTokenizer (br.readLine());

int numcheck = Integer.parseInt(st.nextToken()) ;

boolean bnum[] = new boolean[numcheck];
for(int i = 0;i<bnum.length;i++) {
bnum[i] = true;	
}
			
for(int i =2;i<=Math.sqrt(numcheck);i++)
{
	if (bnum[i]==true){
for(int j = (i*i);j<numcheck;j=j+i){
bnum[j] = false;
    }		
  }					
}
for(int i = 2;i<bnum.length;i++){
if(bnum[i] == true){
	System.out.print(i+" ");
   
        }
	 }					
  }
}