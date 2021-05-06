class Gen <G , T >
{
	G ob1;
	T ob2;
	Gen ( G g , T t)
	{
		ob1 = g;
		ob2 = t;	
	}
	void show ( )
	{
		System.out.println("Value of  is "+ob1.getClass().getName() );
		System.out.println("Value of  is "+ob2.getClass().getName() );
	}
	G showg ()
	{
		return ob1;
	}
	T showt ()
	{
		return ob2;
	}
}
class Hello {
	public static void main(String[] args) {
		
		Gen <Integer, String> gn = new Gen <Integer, String> (73 , " laude");
		gn.show();
		int a = gn.showg();
		System.out.println("\nValue of a is "+a);
		String str = gn.showt();
	System.out.println("Value of str  is "+str)
	}
}