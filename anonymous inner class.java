class greet{
	public void sayhello(){
		System.out.println("Hello");
	}
}

class impgreet{
	greet f = new greet(){
		public void sayhello(){
		System.out.println("Hello from anonymous inner class");
	}
	};
}

public class Main {
	public static void main(String[] args) {
impgreet i = new impgreet ();
i.f.sayhello();		
	}
}