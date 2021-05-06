public class Main {
	public static void main(String[] args) {
	String[] a={ "Sabal","Yunisha","Daniel","Nitesh","Rabin","Protsan","Protsan"
           	};
String temp;
int min;
for(int i = 0;i<a.length;i++)
    {
    	min = i;
  for(int j =i+1;j<a.length;j++)       {
  	if(a[min].compareTo(a[j])>0)
  	{
  	min =j;	
  	}
  	
   	}
   	temp = a[min];
   	a[min]=a[i];
   	a[i]=temp;	
	}
for(int i = 0;i<a.length;i++)
System.out.print(a[i]+" ");					
	}
}