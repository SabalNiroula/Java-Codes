class NewThread implements Runnable{
	String name;
	Thread t;
	
 NewThread(String threadname){
 name = threadname;
 t = new Thread(this,name);
 System.out.println("NewThread : "+t);	
 }
 
 public void run(){
 try {	
 for(int i = 0;i <5;i++){
 	System.out.println(name+" : "+i);
 	Thread.sleep(00);
 	}	
 } catch(InterruptedException e){
 		
    }
    System.out.println(name+ " Exting");
  }
}

public class Main {
	public static void main(String[] args) {
		
NewThread n1 = new NewThread ("One");
n1.t.setPriority(1);
NewThread n2 = new NewThread("Two");
NewThread n3 = new NewThread("Three");

 n1.t.start();
 n2.t.start();
 n3.t.start();		
	}
}