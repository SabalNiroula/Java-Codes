public class Main {
	
public static int gridsoln(int rows,int column){
	
	if(rows==1||column==1) return 1;
	
else return gridsoln(column-1,rows)+gridsoln(rows-1,column);
	
}
	
	
	public static void main(String[] args) {
		
System.out.println(gridsoln(2,2));		
		
	}
}