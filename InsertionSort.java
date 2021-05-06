public class Main {
	public static void main(String[] args) {
	
int arr[] = {13,739,3,52,452,23,24,82,52,4,63,5};
	int temp,j;
		
for(int i =1;i<arr.length;i++){
	temp = arr[i];
	j=i;
	
while(j>0 && arr[j-1]>temp){
  arr[j] = arr[j-1];
  	j--;  	
  	}
  	arr[j]=temp;	
 	}
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+ " "); 							
	}
}