public class Main {
	public static void main(String[] args) {
	
  int[] arr = { 110,763,73,12,72,52};
  int temp;
  
for(int i =0;i<arr.length;i++) 
    {
boolean flag = false;
for(int j = 0;j<arr.length-1-i;j++) {
    if(arr[j]>arr[j+1]){
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