class sbl implements Runnable {
	public void run (){
		try{
for(int i =0;5>i;i++){
	System.out.println("Sabal thread : "+i);
	Thread.sleep(000);
}
}catch (Exception e){}


	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
	sbl sb = new sbl();
	Thread t = new Thread(sb);       t.start();
	
	for(int i =0;5>i;i++){
	System.out.println("Main  thread : "+i);
	Thread.sleep(000);
	}
  }
}