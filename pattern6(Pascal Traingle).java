import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
int number= 1;
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
for(int i=1;i<=n;i++){
	
for(int j=1;j<=(n-i);j++){
	System.out.print(""+"  ");
	
	}	
for(int j = 1;j<=i;j++){
	System.out.print(number++ +"   ");
	
      }
      System.out.println();	
	}			
	}
}
/*
3
    1
  2   3
4   5   6


*/