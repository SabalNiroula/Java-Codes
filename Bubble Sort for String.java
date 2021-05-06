public class Main {
	public static void main(String[] args) {
String arr[] = {"Sabal","Yuni","Nites","Protsan","Daniel","Bishal"};
		
	String temp;
  
for(int i =0;i<arr.length;i++) 
    {
boolean flag = false;
for(int j = 0;j<arr.length-1-i;j++) {
    if(arr[j].compareTo(arr[j+1])>0){
    	temp = arr[j];
    	arr[j] = arr[j+1];
    	arr[j+1]=temp;
    	flag = true;
       }
     }
     if(flag ==false) break;		
   }
for(int i =0;i<arr.length;i++) 
    {
    	System.out.print(arr[i]+" ");
    } 
	}
}