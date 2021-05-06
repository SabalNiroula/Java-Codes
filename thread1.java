 class t1 implements Runnable
 {
 	public void run ()
 	{
 			for (int i= 0; 5>i; i++)
 	try 
 	{
 		System.out.println("T1 Thread : "+i);
 			Thread.sleep(200);
 	} catch (Exception e)
        	{
 	System.out.println();	
       	 }
      }
 }
 	class t2 implements Runnable
 	{
 	public void run ()
       	{
       		for (int j = 0; 5>j; j++)
 			try 
 	{
 		System.out.println("T2 thread : " +j);
 			Thread.sleep(200);
 	} catch (Exception e)
        	{
 	System.out.println();	
        	}
    	}
}
 	class Test {
	public static void main(String[] args) {
		
		t1 obj1 = new t1();
		Thread to1 = new Thread (obj1);
		to1.start();
		
		t2 obj2= new t2();
		Thread to2 = new Thread (obj2);
		to2.start();
		
	}
}