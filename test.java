public class Main {
	
static void getnum(int a){
int count = 0;	
for(int i = 1;i<=a;i++){
	if (a%i==0){ count++; }

	if(count == 500){
		System.out.println(a);
		break;
	}
System.out.println(count);	
}	
}
	
	
	public static void main(String[] args) {
		int n;
 for (int i = 50; i<1272730;i++){ 
  n =(i/2)*(i+1);
  getnum(n);
 	}	
	}
}