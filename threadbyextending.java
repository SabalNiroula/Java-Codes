public class Main extends Thread{

public void run(){
		try{
for(int i =0;5>i;i++){
	System.out.println("Sabal thread : "+i);
	Thread.sleep(000);
}
}catch (Exception e){}
	
}
	public static void main(String[] args) throws InterruptedException {
Main m = new Main();
m.start();	

 for(int i = 0;5>i;i++){
 	System.out.println("Main  thread : "+i);
 	Thread.sleep(000);
 	}	
   }
}