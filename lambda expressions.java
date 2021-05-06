interface Somefunc{
	String func(String n);
}
class argumentpassing{

static String Stringop(Somefunc sf, String s) {
	return sf.func(s);
	}	

	public static void main(String[] args) {

String checks ="Hello World";
String res;

res = Stringop( (str) -> str.toUpperCase() , checks);		

System.out.println(res);

res = Stringop((str) -> {
	   String s = "";
for(int i =str.length()-1;i>=0;i--) s+=str.charAt(i);
return s;
	}, checks);
			
System.out.println(res);

								Somefunc space = (str) ->{
									String s = "";
for(int i = 0;str.length()>i;i++) if(str.charAt(i) != ' ')
s +=str.charAt(i);
								return s;
										 };			
								System.out.println("without space : "+ Stringop(space,checks));		 							
	}
}