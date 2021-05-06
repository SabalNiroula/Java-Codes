public class Main {
	public static void main(String[] args) {
		
int arr[]={2,3,7,5,6,9,5,8 };

int largest = Integer.MIN_VALUE;

int second_largest = Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++){

   if(arr[i]>largest){
   	
   second_largest =largest;	
   largest =arr[i];
        }
   	
 else if(arr[i]>second_largest&&   arr[i]!=largest){
   second_largest= arr[i];		
         }
	
      } 							
      System.out.println(second_largest);							
	}
}