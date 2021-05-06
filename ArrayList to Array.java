import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
int sum = 0;
ArrayList<Integer> al = new ArrayList<Integer>();

al.add(10);
al.add(20);
al.add(30);
al.add(40);		

Integer al_arr[] = new Integer[al.size()];

al_arr = al.toArray(al_arr);					
for(Integer a : al_arr) sum+=a;

System.out.print("The sum is : "+sum);			
	}
}