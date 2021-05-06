import java.util.*;
public class Main {
	
static ArrayList al = new ArrayList();
	
	
	public static void main(String[] args) {
	int maxnum = 2973322;
boolean b[]= new boolean[maxnum];for(int i = 0 ; i<b.length;i++){
	b[i] = true;
}
for(int i =2;i<Math.sqrt(maxnum);i++){
if (b[i]== true) {
for(int j=(i*i);j<maxnum;j=j+i){
	b[j] = false;		
	}
  }
}
for (int i =2;i<b.length;i++){
if ( b[i] == true) {
	al.add(i);
	
}
}
System.out.println(al.get(10000 ));
}}