import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
BufferedReader br =new BufferedReader (new InputStreamReader(System.in));

StringTokenizer st = new StringTokenizer (br.readLine());				
int n =Integer.parseInt(st.nextToken());
int print =7;
for(int i=n;i>=1;i--){
	
	for(int j=1;j<=n-i;j++){
		System.out.print(" ");
	}
for(int j=1;j<=2*i-1;j++){
	System.out.print("*"+"");

	}
	System.out.println();	
	}				
	}
}