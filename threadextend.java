class T1 extends Thread
 {
public void run()
    {
	for (int i = 0; 5>i;i++)
	try
	{
		System.out.println("Thread in T1 : "+i);
		Thread.sleep(500);
	} catch ( Exception e)
	{
		System.out.println(e);
	}
     }
}

class T2 extends Thread
{
	public void run()
	{
		for (int j = 0 ; 5>j; j++)
		try 
		{
		System.out.println("Thread in T2 : "+j);
		Thread.sleep(500);
	} catch ( Exception e)
	{
		System.out.println(e);
	}	
	}
}
class Test 
{
		public static void main(String[] args) {
		T1 obj1 = new T1();
	T2 obj2 = new T2();
		obj1.start();
		obj2.start();	
	}
}
// THREAD USING EXTENDS KEYWORD