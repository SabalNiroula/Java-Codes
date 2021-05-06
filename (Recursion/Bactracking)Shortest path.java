public class Main {
// 	
static int shortpath(int a[][],int i,int j,int x,int y) {

int rows =a.length;
int column =a[0].length;

boolean vis = new boolean[rows][column];	

return shortpath(a[][],i,j,x, y,vis);	
	
}	

static int shortpath(int a[][],int i,int j,int x,int y, boolean vis[][] ) {
	
if(!isvalid(a,i,j,vis)) return 10000000;

if(i==x && j==y) return 0;

vis[i][j]= true;

int left=shortpath(a,i,j-1,x,y,vis)+1;						int bottom=shortpath(a,i+1,j,x,y,vis)+1;		
int right=shortpath(a,i,j+1,x,y,vis)+1;
int top=shortpath(a,i-1,j,x,y,vis)+1;

//BACKTRACKING
vis[i][j]=false;
return Math.min(Math.min(left,bottom),Math.min(right,top));				
}

static boolean isvalid(int a[][],int i, int j,boolean vis[][]){
	
int rows = a.length;
int column = a[0].length;

return j>=0 && i>=0 && i<rows && j<column && a[i][j] =1 && !vis[i][j];
}

	public static void main(String[] args) {
	
		
int a[][]=
   {
      {1,0,1,1,1,1,0,1},	
      {1,1,0,1,1,0,1,0},
      {0,1,1,1,0,1,0,1}, 
      {1,0,1,1,1,1,0,1},
      {1,0,1,0,0,1,1,1}, 
   };
System.out.println(shortpath (a,0,0,4,8));
							
	}
}