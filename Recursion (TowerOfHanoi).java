public class Main {
	
public static String tower(int n,boolean left){
	if (n==0) return " ";
	String move;
	if(left)
	move= n+"L";
	else 
	move = n+"R";
	return tower(n-1, !left)+move+tower(n-1, !left);
	
	
}	
	public static void main(String[] args) {
	
int n = 4;

System.out.println(tower (n,false));						
	}
}