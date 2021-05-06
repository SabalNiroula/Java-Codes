import java.util.function.Function;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a Number : ");
String a = br.readLine();

int n = Integer.parseInt(a);
Function<Integer,Integer> fii = i -> i*i;

System.out.println("The square root of "+n+" is "+fii.apply(n));								
	}
}